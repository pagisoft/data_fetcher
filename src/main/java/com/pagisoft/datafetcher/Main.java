package com.pagisoft.datafetcher;

import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Connector connector = new AllegroConnector();

        String token = connector.getToken();
        String auction = connector.getObjectList();

        LOGGER.info("Token: {}", token);
        LOGGER.info("Auction: {}", auction);
    }
}
