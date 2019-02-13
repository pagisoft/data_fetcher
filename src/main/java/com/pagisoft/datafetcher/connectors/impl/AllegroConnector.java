package com.pagisoft.datafetcher.connectors.impl;

import com.pagisoft.datafetcher.connectors.Connector;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;

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

    public String getObjectList() {

        Client client = Client.create();

        WebResource.Builder builder = client
                .resource(API_URL + "offers/listing?category.id=258832&searchMode=CLOSED&limit=1&offset=0")
                .header("Authorization", "Bearer " + token)
                .header("Accept", "application/vnd.allegro.public.v1+json" );

        ClientResponse response = builder.get(ClientResponse.class);

        client.destroy();

        return response.getEntity(String.class);
    }

}
