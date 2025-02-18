package com.practice.csvhandling;

import com.opencsv.CSVWriter;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class WriteCSVTest {
    @Test
    void writeCSV(){
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
        String ans="ID-\"104\"  Name-\"Abhishek\"  Age-\"22\"  Marks-\"69\"\nID-\"105\"  Name-\"Muskan\"  Age-\"20\"  Marks-\"98\"\n";

        assertEquals(ReadAndPrintCSV.ReadCSV("src\\main\\resources\\output.csv"),ans);
    }


}