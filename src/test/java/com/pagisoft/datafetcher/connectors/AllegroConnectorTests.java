package com.pagisoft.datafetcher.connectors;

import com.google.common.base.Stopwatch;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import com.pagisoft.datafetcher.model.allegro.AllegroCategory;
import com.pagisoft.datafetcher.model.allegro.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllegroConnectorTests {

    private static final Logger LOGGER = LogManager.getLogger(AllegroConnectorTests.class);

    private static final Connector allegroConnector = new AllegroConnector();

    private static final String TEST_CATEGORY_ID = "54045"; //dom i ogród -> wypozażenie -> pudełka

    private static final int ROOT_LEVEL_CATEGORY_COUNT = 13;

    private static final int MAX_NUMBER_OF_LISTING_ITERATIONS = 60;
    private static final int LIMTIT_PER_LISTING = 100;

    @Test
    public void testGetObjectList() {
        Stopwatch timer = Stopwatch.createStarted();

        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i < MAX_NUMBER_OF_LISTING_ITERATIONS; i++) {
            LOGGER.info("Iteration: {}", i);
            List<Object> objects = allegroConnector.getObjectList( TEST_CATEGORY_ID, LIMTIT_PER_LISTING, i * LIMTIT_PER_LISTING);
            LOGGER.info("Auctions count in iteration: {}", objects.size());
            auctions.addAll(objects);
            LOGGER.info("Final auctions count: {}", auctions.size());
        }
        LOGGER.info("Collecting objects [ size {} ] took: {}", auctions.size(), timer.stop());

        List<Item> auctionItems = new ArrayList<Item>();

        for (int i = 0; i < auctions.size(); i++) {
            if (((Item) auctions.get(i)).getSellingMode().getPopularity() > 0) {
                auctionItems.add((Item) auctions.get(i));
            }
        }

        LOGGER.info("Final auctions with existing popularity count: {}", auctionItems.size());

        Assert.assertNotEquals(0, auctions.size());
        Assert.assertNotEquals(0, auctionItems.size());
    }

    @Test
    public void testGetCategoryList() {
        Stopwatch timer = Stopwatch.createStarted();


        List<Object> allegroRootCategories = allegroConnector.getCategoryList(null);
        LOGGER.info("Collecting objects [ size {} ] took: {}", allegroRootCategories.size(), timer.stop());

        Assert.assertEquals(ROOT_LEVEL_CATEGORY_COUNT, allegroRootCategories.size());

    }
}
