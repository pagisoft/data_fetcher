package com.pagisoft.datafetcher.soap.client;

import com.google.common.base.Stopwatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class AllegroWebApiClientTests {

    private static final AllegroWebApiClient allegroWebApiClient = new AllegroWebApiClient();

    private static final Logger LOGGER = LogManager.getLogger(AllegroWebApiClientTests.class);

    @Test
    public void test123() {
        Stopwatch timer = Stopwatch.createStarted();
        allegroWebApiClient.allegroWebApiLogin();
        LOGGER.info("took: {}", timer.stop());
    }
}
