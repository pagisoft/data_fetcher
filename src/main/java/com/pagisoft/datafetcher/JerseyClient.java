package com.pagisoft.datafetcher;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClient {

    public void getToken() {

        Client client = Client.create();

        WebResource.Builder builder = client
                .resource("https://allegro.pl/auth/oauth/token?grant_type=client_credentials")
                .header("Authorization", "Basic Mzg5MmNhZGZkMGUwNDZjOGFhZGUyMmYxZmRlMzliZjY6dnhGRGVpeTg0SVY3SUlhRGRlbndCZk1QNXp4TVlPR0ZsaVJoTGFxZVNCZ1dmU0VNMjFvNUlsNjRkUDRUeWdVZA==");
        ClientResponse response = builder.get(ClientResponse.class);


        System.out.println(response.getEntity(String.class));
    }




}
