package com.pagisoft.datafetcher.common;

import com.pagisoft.datafetcher.model.allegro.Item;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AvroWriter {

    private static final Logger LOGGER = LogManager.getLogger(AvroWriter.class);

    public void storeAvroData(List<Object> objectsListToStore) {

        LOGGER.info("Start writing to avro...");

        toAvroBinary(objectsListToStore);

        LOGGER.info("Completed writing to avro.");
    }

    private void toAvroBinary(final List<Object> objectList) {

        File avroOutputFile = new File("/home/ec2-user/data/" + System.currentTimeMillis() + ".avro");

        final DatumWriter<Item> datumWriter = new SpecificDatumWriter<Item>(Item.class);
        final DataFileWriter<Item> dataFileWriter = new DataFileWriter<Item>(datumWriter);

        try {
            dataFileWriter.create(Item.getClassSchema(), avroOutputFile);

            for (int i = 0; i < objectList.size(); i++) {
                dataFileWriter.append((Item) objectList.get(i));
            }

            dataFileWriter.close();
            LOGGER.info("Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
