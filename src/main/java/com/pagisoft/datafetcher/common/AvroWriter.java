package com.pagisoft.datafetcher.common;

import org.apache.avro.io.DatumWriter;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AvroWriter {

    private static final Logger LOGGER = LogManager.getLogger(AvroWriter.class);

    public void storeAvroFile() {

        LOGGER.info("here");

        /**List<TestObject> objectList = new ArrayList<TestObject>();
        objectList.add(new TestObject(22L, "Nazwa Abc"));
        objectList.add(new TestObject(24L, "Nazwa Def"));
        objectList.add(new TestObject(26L, "Nazwa Ghi"));

        toAvroBinary(objectList);

        LOGGER.info(objectList.get(0).getObjectName());
    }

    private void toAvroBinary(final List<TestObject> objectList) {

        File avroOutputFile = new File("D:\\Dane\\testobjects.avro");

        final DatumWriter<TestObject> datumWriter = new SpecificDatumWriter<TestObject>(TestObject.class);
        final DataFileWriter<TestObject> dataFileWriter = new DataFileWriter<TestObject>(datumWriter);

        try {
            LOGGER.info("create");
            dataFileWriter.create(TestObject.getClassSchema(), avroOutputFile);
            dataFileWriter.append(objectList.get(0));
            dataFileWriter.append(objectList.get(1));
            dataFileWriter.append(objectList.get(2));
            dataFileWriter.close();
            LOGGER.info("done");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //return null; **/
    }

}
