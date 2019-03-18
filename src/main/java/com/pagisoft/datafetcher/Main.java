package com.pagisoft.datafetcher;

import com.pagisoft.datafetcher.common.AllegroTokenFileWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    private static final AllegroTokenFileWriter allegroTokenFileWriter = new AllegroTokenFileWriter();

    public static void main(String[] args) {

        LOGGER.info("Main.");

        allegroTokenFileWriter.storeToken("ddddd", "gggg");

        allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.ACCESS_TOKEN);

        LOGGER.info(allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.ACCESS_TOKEN));
        LOGGER.info(allegroTokenFileWriter.readToken(AllegroTokenFileWriter.TokenType.REFRESH_TOKEN));

    }
}
