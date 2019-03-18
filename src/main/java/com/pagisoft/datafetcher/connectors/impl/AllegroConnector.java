package com.pagisoft.datafetcher.connectors.impl;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.model.allegro.AllegroCategory;
import com.pagisoft.datafetcher.model.allegro.Item;
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
    //private static String SECRET = "ZDQ3Mzk1YjgyOWZlNDkwNWE2MzhmYTBmY2NmNDk5OTY6VU5JMUlCcUFHcWg5d1dGc1JmZlNKOUVYQ0tQaFBaNGR4cFhIaExiVE94M3NDYnRMREVNbVhUQzMwTDgwMXhwZw==";

    //private static String SECRET = "Mzg5MmNhZGZkMGUwNDZjOGFhZGUyMmYxZmRlMzliZjY6dnhGRGVpeTg0SVY3SUlhRGRlbndCZk1QNXp4TVlPR0ZsaVJoTGFxZVNCZ1dmU0VNMjFvNUlsNjRkUDRUeWdVZA==";
    private static String ALLEGRO_URL = "https://allegro.pl/";
    private static String API_URL = "https://api.allegro.pl/";

    private static String SECRET = "NjA1YWVjYTVhNDNkNDg1ZmIzNGIzOTJjNTQ0ZjBhMzI6a2VvN2hqeGxiMG1FdzRsOFVkQTZkMWVPc29yekN1Z3o5YXgxMFI4aURIVjlJNmJIQWRHWlk5bFlLeEt6bzUzbg==";

    private static String token;

    // Konstruktor
    public AllegroConnector() {

        this.token = getToken();

    }

    private void storeToken() {

    }

    private String readToken() {
        return null;
    }

    public String getToken() {

        LOGGER.info("Getting token based on refresh_token");

        Client client = Client.create();

        WebResource.Builder builder = client
                .resource(ALLEGRO_URL + "auth/oauth/token?" +
                        "grant_type=urn%3Aietf%3Aparams%3Aoauth%3Agrant-type%3Adevice_code&device_code=oYZh1gkNnJO411S6Lm82hpoBsXJJaGIc")
                .header("Authorization", "Basic " + SECRET);

        /**WebResource.Builder builder = client
                .resource(ALLEGRO_URL + "auth/oauth/token?" +
                        "grant_type=client_credentials")
                .header("Authorization", "Basic " + SECRET);**/

        //https://allegro.pl/auth/oauth/token?grant_type=urn%3Aietf%3Aparams%3Aoauth%3Agrant-type%3Adevice_code&device_code=oYZh1gkNnJO411S6Lm82hpoBsXJJaGIc

        ClientResponse response = builder.get(ClientResponse.class);

        JSONObject object = new JSONObject(response.getEntity(String.class));
        this.token = object.getString("access_token");

        client.destroy();

        LOGGER.info(this.token);

        return this.token;
    }

    public List<Object> getObjectList(String categoryId, Integer limit, Integer offset) {

        Client client = Client.create();

        WebResource.Builder builder = client
                .resource(API_URL + "offers/listing?" +
                        "category.id=" + categoryId +
                        "&searchMode=REGULAR" +
                        "&sort=-popularity" +
                        "&limit=" + limit.toString() +
                        "&offset=" + offset.toString())
                .header("Authorization", "Bearer " + this.token)
                .header("Accept", "application/vnd.allegro.public.v1+json" );

        ClientResponse response = builder.get(ClientResponse.class);

        client.destroy();

        if (Response.Status.OK.getStatusCode() == response.getStatus()) {
            return parseObjectList(response.getEntity(String.class));
        } else {
            LOGGER.error("Incorrect response while calling REST API. {}", response);
            //throw new RuntimeException("Incorrect response while calling REST API.");
            return new ArrayList<>();
        }
    }

    private List<Object> parseObjectList(String responseEntity) {

        List<Object> completeResult = new ArrayList<Object>();

        JsonParser parser = new JsonParser();
        JsonObject object = parser.parse(responseEntity).getAsJsonObject();

        JsonElement promotedList = object.get("items").getAsJsonObject().get("promoted");
        JsonElement regularList = object.get("items").getAsJsonObject().get("regular");

        Gson gson = new Gson();
        Type resultType = new TypeToken<List<Item>>(){}.getType();

        List<Item> promotedListResult = gson.fromJson(promotedList, resultType);
        List<Item> regularListResult = gson.fromJson(regularList, resultType);

        completeResult.addAll(promotedListResult);
        completeResult.addAll(regularListResult);

        return completeResult;
    }

    public List<Object> getCategoryList(String parentCategoryId) {
        Client client = Client.create();

        String parentCategoryQueryString = "";
        if (parentCategoryId != null) {
            parentCategoryQueryString = "?parent.id=" + parentCategoryId;
        } else {
            LOGGER.info("Getting top category list.");
        }

        WebResource.Builder builder = client
                .resource(API_URL + "sale/categories" +
                        parentCategoryQueryString)
                .header("Authorization", "Bearer " + this.token)
                .header("Accept", "application/vnd.allegro.public.v1+json" );

        ClientResponse response = builder.get(ClientResponse.class);

        client.destroy();

        if (Response.Status.OK.getStatusCode() == response.getStatus()) {
            return parseCategoryList(response.getEntity(String.class));
        } else {
            LOGGER.error("Incorrect response while calling REST API. {}", response);
            //throw new RuntimeException("Incorrect response while calling REST API.");
            return new ArrayList<>();
        }
    }

    private List<Object> parseCategoryList(String responseEntity) {

        List<Object> completeResult = new ArrayList<Object>();

        JsonParser parser = new JsonParser();
        JsonObject object = parser.parse(responseEntity).getAsJsonObject();

        Gson gson = new Gson();
        Type resultType = new TypeToken<List<AllegroCategory>>(){}.getType();

        List<AllegroCategory> categoryListResult = gson.fromJson(object.get("categories"), resultType);

        completeResult.addAll(categoryListResult);

        return completeResult;
    }
}
