package com.pagisoft.datafetcher.common;

import com.google.common.io.Resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Properties;

public class AllegroTokenFileWriter {

    private static final Logger LOGGER = LogManager.getLogger(AllegroTokenFileWriter.class);

    private static final String TOKEN_RESOURCE_FILE = "token.key";

    public enum TokenType {
        ACCESS_TOKEN("access_token"),
        REFRESH_TOKEN("refresh_token");

        private String tokenTag;

        public String getTokenTag()
        {
            return this.tokenTag;
        }

        private TokenType(String tokenTag)
        {
            this.tokenTag = tokenTag;
        }
    }

    public void storeToken(String accessTokenValue, String refreshTokenValue) {
        Properties properties = new Properties();

        properties.setProperty(TokenType.ACCESS_TOKEN.getTokenTag(), accessTokenValue);
        properties.setProperty(TokenType.REFRESH_TOKEN.getTokenTag(), refreshTokenValue);

        try {
            PrintWriter writer = new PrintWriter(
                    new File(
                            Resources.getResource(TOKEN_RESOURCE_FILE).getPath()
                    )
            );
            properties.store(writer, null);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public String readToken(TokenType tokenType) {
        Properties properties = new Properties();

        try {
            InputStream inputStream = this.getClass().getResourceAsStream(
                    Resources.getResource(TOKEN_RESOURCE_FILE).getPath()
            );

            properties.load(inputStream);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }

        return properties.getProperty(tokenType.getTokenTag());
    }
}
