package com.pagisoft.datafetcher.common;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataFileWriter {

    public void writeStringToFile(String formattedData, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(formattedData);
        printWriter.close();
    }
}
