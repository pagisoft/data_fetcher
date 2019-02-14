package com.pagisoft.datafetcher;

import com.google.common.base.Stopwatch;
import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Stopwatch timer = Stopwatch.createStarted();

        Connector connector = new AllegroConnector();

        String token = connector.getToken();
        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i<100; i++) {
            auctions.addAll(connector.getObjectList(100,i));
        }

        LOGGER.info("Collecting objects [ size {} ] took: {}", auctions.size(), timer.stop());
        LOGGER.info("Token: {}", token);
        // LOGGER.info("Auction: {}", auctions);
    }
}
