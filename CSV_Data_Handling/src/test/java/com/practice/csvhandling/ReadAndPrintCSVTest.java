package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndPrintCSVTest {
    @Test
    void readAndPrint(){
        String filePath="src\\main\\resources\\input.csv";
        String ans="ID-101  Name-Abhi  Age-22  Marks-69\nID-102  Name-Muskan  Age-20  Marks-98\nID-103  Name-Nitesh  Age-24  Marks-24\nID-104  Name-Naincy  Age-18  Marks-56\n";

        assertEquals(ReadAndPrintCSV.ReadCSV(filePath),ans);
    }

}