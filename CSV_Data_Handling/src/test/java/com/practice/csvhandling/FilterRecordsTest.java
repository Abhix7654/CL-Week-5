package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterRecordsTest {
    @Test
    void readRecord(){
        String filePath = "src\\main\\resources\\input.csv";
        String ans="ID-102  Name-Muskan  Age-20  Marks-98\n";

        assertEquals(FilterRecords.filterrecord(filePath),ans);

    }

}