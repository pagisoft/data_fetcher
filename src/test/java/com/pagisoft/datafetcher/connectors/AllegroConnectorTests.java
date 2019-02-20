package com.pagisoft.datafetcher.connectors;

import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import com.pagisoft.datafetcher.model.allegro.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllegroConnectorTests {

    private static final Logger LOGGER = LogManager.getLogger(AllegroConnectorTests.class);

    @Test
    public void testGetObjectList() {
        Connector allegroConnector = new AllegroConnector();
        allegroConnector.getToken();

        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i < 60; i++) {
            LOGGER.info("Iteration: {}", i);
            List<Object> objects = allegroConnector.getObjectList(100, i * 100);
            LOGGER.info("Auctions count in iteration: {}", objects.size());
            auctions.addAll(objects);
            LOGGER.info("Final auctions count: {}", auctions.size());
        }

        List<Item> auctions1 = new ArrayList<Item>();

        for (int i = 0; i < auctions.size(); i++) {
            if (((Item) auctions.get(i)).getSellingMode().getPopularity() != 0) {
                auctions1.add((Item) auctions.get(i));
            }
        }

        Assert.assertNotEquals(0, auctions.size());
    }
}
