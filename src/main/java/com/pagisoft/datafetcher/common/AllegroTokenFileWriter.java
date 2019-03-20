package com.pagisoft.datafetcher.common;

import com.google.common.io.Resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URISyntaxException;
import java.util.Properties;

public class AllegroTokenFileWriter {

    private static final Logger LOGGER = LogManager.getLogger(AllegroTokenFileWriter.class);

    private static final String TOKEN_FILE = "token.key";
    private static String TOKEN_FILE_PATH = "";

    public enum TokenType {
        ACCESS_TOKEN("access_token"),
        REFRESH_TOKEN("refresh_token");

        private String tokenTag;

        public String getTokenTag()
        {
            return this.tokenTag;
        }

        TokenType(String tokenTag)
        {
            this.tokenTag = tokenTag;
        }
    }

    public AllegroTokenFileWriter() throws URISyntaxException {
        TOKEN_FILE_PATH = new File(
                this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()
        ).getParent();

        LOGGER.info("Token file location: {}", TOKEN_FILE_PATH);
    }

    public void storeToken(String accessTokenValue, String refreshTokenValue) throws IOException {
        LOGGER.info("Store tokens into file...");

        Properties properties = new Properties();

        properties.setProperty(TokenType.ACCESS_TOKEN.getTokenTag(), accessTokenValue);
        properties.setProperty(TokenType.REFRESH_TOKEN.getTokenTag(), refreshTokenValue);

        PrintWriter writer = new PrintWriter(
                new File(
                        TOKEN_FILE_PATH, TOKEN_FILE
                )
        );
        properties.store(writer, null);
    }

    public String readToken(TokenType tokenType) throws IOException {
        LOGGER.info("Read {} from token file...", tokenType);
        Properties properties = new Properties();

        InputStream inputStream = new FileInputStream(
                new File(
                        TOKEN_FILE_PATH, TOKEN_FILE
                )
        );

        properties.load(inputStream);

        return properties.getProperty(tokenType.getTokenTag());
    }
}
