package com.pagisoft.datafetcher.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

public class AllegroTokenFileWriterTests {

    private static final Logger LOGGER = LogManager.getLogger(AllegroTokenFileWriterTests.class);

    private static AllegroTokenFileWriter allegroTokenFileWriter;

    @Test
    public void testStoreAndReadToken() {
        String allegroAccessToken = "";
        String allegroRefreshToken = "";
        String accessToken = "AccessTokenValue12345";
        String refreshToken = "RefreshTokenValue12345";

        try {
            allegroTokenFileWriter = new AllegroTokenFileWriter();
            allegroTokenFileWriter.storeToken(accessToken, refreshToken);

            allegroAccessToken = allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.ACCESS_TOKEN);
            allegroRefreshToken = allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.REFRESH_TOKEN);
        } catch (IOException | URISyntaxException e) {
            LOGGER.error(e.getMessage());
        }

        LOGGER.info(allegroAccessToken);
        LOGGER.info(allegroRefreshToken);
        Assert.assertEquals(accessToken, allegroAccessToken);
        Assert.assertEquals(refreshToken, allegroRefreshToken);
    }
}
