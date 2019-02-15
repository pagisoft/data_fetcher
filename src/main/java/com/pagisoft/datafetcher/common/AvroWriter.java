package com.pagisoft.datafetcher.common;

import com.pagisoft.datafetcher.domain.allegro.TestObject;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AvroWriter {

    private static final Logger LOGGER = LogManager.getLogger(AvroWriter.class);

    public void storeAvroFile() {

        LOGGER.info("here");

        List<TestObject> objectList = new ArrayList<TestObject>();
        objectList.add(new TestObject(22L, "Nazwa Abc"));

        LOGGER.info(objectList.get(0).getName());
    }

    private byte[] toAvroBinary(final List<Object> objectList) {

        final DatumWriter<Object> datumWriter = new SpecificDatumWriter<Object>();

        return null;
    }

}
