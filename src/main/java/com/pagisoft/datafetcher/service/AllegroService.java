package com.pagisoft.datafetcher.service;

import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import com.pagisoft.datafetcher.model.allegro.AllegroCategory;
import com.pagisoft.datafetcher.model.allegro.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllegroService {

    private static final Logger LOGGER = LogManager.getLogger(AllegroService.class);

    private static final List<AllegroCategory> finalCategoriesList = new ArrayList<AllegroCategory>();
    private static final List<AllegroCategory> finalLowestTierCategoriesList = new ArrayList<AllegroCategory>();

    private static final int MAX_NUMBER_OF_LISTING_ITERATIONS = 60;
    private static final int LIMTIT_PER_LISTING = 100;

    private Connector allegroConnector = new AllegroConnector();

    public List<AllegroCategory> getFinalCategoriesList() {
        getCategoryTreeForParentId(null);
        LOGGER.info("Resolved {} categories.", finalCategoriesList.size());
        return finalCategoriesList;
    }

    public List<AllegroCategory> getFinalLowestTierCategoriesList() {
        getCategoryTreeForParentId(null);
        LOGGER.info("Resolved {} lowest tier categories.", finalLowestTierCategoriesList.size());
        return finalLowestTierCategoriesList;
    }

    private void getCategoryTreeForParentId(String parentId) {

        List<AllegroCategory> allegroCategories = this.allegroConnector.getCategoryList(parentId)
                .stream()
                .map(obj -> {
                    AllegroCategory temp = (AllegroCategory) obj;
                    if (!temp.getLeaf()) {
                        getCategoryTreeForParentId(temp.getId());
                    } else {
                        this.finalLowestTierCategoriesList.add(temp);
                    }
                    this.finalCategoriesList.add(temp);
                    return temp;
                })
                .collect(Collectors.toList());
    }

    public List<Item> getItemsByCategory(String categoryId) {
        List<Item> auctions = new ArrayList<Item>();

        LOGGER.info("Starting to resolve auctions for categoryId: {}.", categoryId);

        for (int i=0; i < MAX_NUMBER_OF_LISTING_ITERATIONS; i++) {
            List<Object> objects = allegroConnector.getObjectList(categoryId, LIMTIT_PER_LISTING, i * LIMTIT_PER_LISTING);

            auctions.addAll(objects
                    .stream()
                    .map( obj -> (Item) obj)
                    .filter( obj -> obj.getSellingMode().getPopularity() > 0)
                    .collect(Collectors.toList()));
        }

        LOGGER.info("Resolved {} auctions.", auctions.size());

        return auctions;
    }
}
