package com.pagisoft.datafetcher.common;

import org.junit.Test;

public class AvroWriterTests {

    @Test
    public void testStoreAvroFile() {
        AvroWriter avroWriter = new AvroWriter();
        avroWriter.storeAvroFile();
    }
}