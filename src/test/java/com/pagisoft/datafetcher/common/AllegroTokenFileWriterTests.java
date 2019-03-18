package com.pagisoft.datafetcher.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class AllegroTokenFileWriterTests {

    private static final Logger LOGGER = LogManager.getLogger(AllegroTokenFileWriterTests.class);

    private static final AllegroTokenFileWriter allegroTokenFileWriter = new AllegroTokenFileWriter();

    @Test
    public void testReadToken() {
        //LOGGER.info("");

        String allegroToken = allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.ACCESS_TOKEN);
        LOGGER.info(allegroToken);

        Assert.assertNotEquals("", allegroToken);
    }

    @Test
    public void testStoreToken() {
        //LOGGER.info("");

        allegroTokenFileWriter.storeToken("aaaaa", "bbbb");

        //LOGGER.info("");allegroTokenFileWriter.readToken();
    }
}
