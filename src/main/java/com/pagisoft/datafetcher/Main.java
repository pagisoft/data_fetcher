package com.pagisoft.datafetcher;

import com.google.common.base.Stopwatch;
import com.pagisoft.datafetcher.common.AvroWriter;
import com.pagisoft.datafetcher.model.allegro.AllegroCategory;
import com.pagisoft.datafetcher.service.AllegroService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    private static final AllegroService allegroService = new AllegroService();

    public static void main(String[] args) throws IOException {

        Stopwatch timer = Stopwatch.createStarted();

        List<Object> allegroItems = new ArrayList<>();
        List<AllegroCategory> finalLowestTierCategoriesList = allegroService.getFinalLowestTierCategoriesList();

        for (AllegroCategory category : finalLowestTierCategoriesList) {
            allegroItems.addAll(allegroService.getItemsByCategory(category.getId()));

            if (allegroItems.size() > 100000) {
                AvroWriter avroWriter = new AvroWriter();
                avroWriter.storeAvroData(allegroItems);
                allegroItems.clear();
            }

            LOGGER.info("Collecting category objects [ size {} ] took: {}", allegroItems.size(), timer.elapsed().toSeconds());
        }

        LOGGER.info("Collecting objects [ size {} ] took: {}", allegroItems.size(), timer.stop());
    }
}
