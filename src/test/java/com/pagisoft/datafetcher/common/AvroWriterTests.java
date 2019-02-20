package com.pagisoft.datafetcher.common;

import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AvroWriterTests {

    private static final Logger LOGGER = LogManager.getLogger(AvroWriterTests.class);

    @Test
    public void testStoreAvroFile() {
        Connector allegroConnector = new AllegroConnector();
        allegroConnector.getToken();

        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i < 1; i++) {
            LOGGER.info("Iteration: {}", i);
            List<Object> objects = allegroConnector.getObjectList(100, i * 100);
            LOGGER.info("Auctions count in iteration: {}", objects.size());
            auctions.addAll(objects);
            LOGGER.info("Final auctions count: {}", auctions.size());
        }

        Assert.assertNotEquals(0, auctions.size());

        AvroWriter avroWriter = new AvroWriter();
        avroWriter.storeAvroData(auctions);

        Assert.assertNotEquals(0, auctions.size());
    }
}