package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReadAndCountCSVTest {
    @Test
    void countRowCSV(){
        String filePath = "src\\main\\resources\\input.csv";

        int row=4;
        assertEquals(ReadAndCountCSV.countRow(filePath),row);

    }

}