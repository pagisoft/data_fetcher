package com.pagisoft.datafetcher.connectors.impl;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.pagisoft.datafetcher.connectors.Connector;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

import javax.ws.rs.core.Response;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AllegroConnector implements Connector {

    private static final Logger LOGGER = LogManager.getLogger(AllegroConnector.class);

    private static String SECRET = "Mzg5MmNhZGZkMGUwNDZjOGFhZGUyMmYxZmRlMzliZjY6dnhGRGVpeTg0SVY3SUlhRGRlbndCZk1QNXp4TVlPR0ZsaVJoTGFxZVNCZ1dmU0VNMjFvNUlsNjRkUDRUeWdVZA==";

    private static String ALLEGRO_URL = "https://allegro.pl/";

    private static String API_URL = "https://api.allegro.pl/";

    private static String token;

    public String getToken() {

        LOGGER.info("Getting token");
        Client client = Client.create();

        WebResource.Builder builder = client
                .resource(ALLEGRO_URL + "auth/oauth/token?grant_type=client_credentials")
                .header("Authorization", "Basic " + SECRET);
        ClientResponse response = builder.get(ClientResponse.class);

        JSONObject object = new JSONObject(response.getEntity(String.class));
        token = object.getString("access_token");

        client.destroy();
        return token;
    }

    public List<Object> getObjectList(Integer limit, Integer offset) {

        Client client = Client.create();

        WebResource.Builder builder = client
                .resource(API_URL + "offers/listing?category.id=258832&searchMode=CLOSED&limit=" + limit.toString() + "&offset=" + offset.toString())
                .header("Authorization", "Bearer " + token)
                .header("Accept", "application/vnd.allegro.public.v1+json" );

        ClientResponse response = builder.get(ClientResponse.class);

        client.destroy();

        List<Object> result = new ArrayList<Object>();

        if (Response.Status.OK.getStatusCode() == response.getStatus()) {
            String jsonList = response.getEntity(String.class);

            JsonParser parser = new JsonParser();
            JsonObject object = parser.parse(jsonList).getAsJsonObject();
            JsonElement promotedList = object.get("items").getAsJsonObject().get("promoted");
            JsonElement regularList = object.get("items").getAsJsonObject().get("regular");

            Gson gson = new Gson();
            Type resultType = new TypeToken<List<Object>>(){}.getType();

            List<Object> promotedListResult = gson.fromJson(promotedList, resultType);
            List<Object> regularListResult = gson.fromJson(regularList, resultType);

            result.addAll(promotedListResult);
            result.addAll(regularListResult);
        }

        return result;
    }

}
