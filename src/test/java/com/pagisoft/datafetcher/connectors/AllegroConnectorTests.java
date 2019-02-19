package com.pagisoft.datafetcher.connectors;

import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllegroConnectorTests {

    @Test
    public void testGetObjectList() {
        Connector allegroConnector = new AllegroConnector();
        allegroConnector.getToken();

        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i < 1; i++) {
            List<Object> objects = allegroConnector.getObjectList(100, 1);
            auctions.addAll(objects);
        }

        Assert.assertNotEquals(0, auctions.size());
    }
}