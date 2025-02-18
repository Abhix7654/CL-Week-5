package com.practice.csvhandling;
import java.io.*;

import com.opencsv.CSVWriter;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath="src\\main\\resources\\output.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] emp1 = {"104", "Abhishek", "22", "69"};
            String[] emp2 = {"105", "Muskan", "20", "98"};
            writer.writeNext(emp1);
            writer.writeNext(emp2);
            System.out.println("CSV file written successfully using OpenCSV!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
