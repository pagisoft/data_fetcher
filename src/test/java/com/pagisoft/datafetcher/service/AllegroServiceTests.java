package com.pagisoft.datafetcher.service;

import com.google.common.base.Stopwatch;
import com.pagisoft.datafetcher.common.AvroWriter;
import com.pagisoft.datafetcher.model.allegro.AllegroCategory;
import com.pagisoft.datafetcher.model.allegro.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AllegroServiceTests {

    private static final Logger LOGGER = LogManager.getLogger(AllegroServiceTests.class);

    private static final AllegroService allegroService = new AllegroService();

    private static final String TEST_CATEGORY_ID = "54045"; //dom i ogród -> wypozażenie -> pudełka

    @Test
    public void testGetFinalCategoriesList() {
        Stopwatch timer = Stopwatch.createStarted();

        List<AllegroCategory> finalCategoriesList = allegroService.getFinalCategoriesList();

        LOGGER.info("Collecting objects [ size {} ] took: {}", finalCategoriesList.size(), timer.stop());
        Assert.assertNotEquals(0, finalCategoriesList.size());
    }

    @Test
    public void testGetFinalLowestTierCategoriesList() {
        Stopwatch timer = Stopwatch.createStarted();

        List<AllegroCategory> finalLowestTierCategoriesList = allegroService.getFinalLowestTierCategoriesList();

        LOGGER.info("Collecting objects [ size {} ] took: {}", finalLowestTierCategoriesList.size(), timer.stop());
        Assert.assertNotEquals(0, finalLowestTierCategoriesList.size());
    }

    @Test
    public void testGetItemsByCategory() {
        Stopwatch timer = Stopwatch.createStarted();

        List<Item> allegroItems = allegroService.getItemsByCategory("111852");

        LOGGER.info("Collecting objects [ size {} ] took: {}", allegroItems.size(), timer.stop());
        Assert.assertNotEquals(0, allegroItems.size());
    }

    @Test
    public void testGetItemsByCategoryList() {
        Stopwatch timer = Stopwatch.createStarted();

        List<Object> allegroItems = new ArrayList<>();
        List<AllegroCategory> finalLowestTierCategoriesList = allegroService.getFinalLowestTierCategoriesList();

        for (AllegroCategory category : finalLowestTierCategoriesList) {
            allegroItems.addAll(allegroService.getItemsByCategory(category.getId()));

            AvroWriter avroWriter = new AvroWriter();
            avroWriter.storeAvroData(allegroItems);

            LOGGER.info("Collecting category objects [ size {} ] took: {}", allegroItems.size(), timer.elapsed().toSeconds());
            allegroItems.clear();
        }

        LOGGER.info("Collecting objects [ size {} ] took: {}", allegroItems.size(), timer.stop());
        Assert.assertNotEquals(0, allegroItems.size());
    }


}
