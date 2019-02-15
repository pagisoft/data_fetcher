package com.pagisoft.datafetcher;

import com.google.common.base.Stopwatch;
import com.pagisoft.datafetcher.common.DataFileWriter;
import com.pagisoft.datafetcher.connectors.Connector;
import com.pagisoft.datafetcher.connectors.impl.AllegroConnector;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    private static final String FILE =  "D:\\Dane\\dane.json";

    public static void main(String[] args) throws IOException {

        Stopwatch timer = Stopwatch.createStarted();

        Connector connector = new AllegroConnector();

        String token = connector.getToken();
        LOGGER.info("Token: {}", token);

        List<Object> auctions = new ArrayList<Object>();

        for (int i=0; i < 1; i++) {
            LOGGER.info("Iteration: {}", i);
            List<Object> objects = connector.getObjectList(100, i);
            LOGGER.info("Auctions count in iteration: {}", objects.size());
            auctions.addAll(objects);
            LOGGER.info("Final auctions count: {}", auctions.size());

            DataFileWriter dataFileWriter = new DataFileWriter();
            dataFileWriter.writeStringToFile(objects.toString(), FILE);
        }

        LOGGER.info("Collecting objects [ size {} ] took: {}", auctions.size(), timer.stop());
        // LOGGER.info("Auctions: {}", auctions);
    }
}
