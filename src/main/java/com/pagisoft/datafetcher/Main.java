package com.pagisoft.datafetcher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("test123");

        new JerseyClient().getToken();

        LOGGER.info("Done");
    }
}
