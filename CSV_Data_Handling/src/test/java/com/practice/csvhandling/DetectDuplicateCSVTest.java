package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectDuplicateCSVTest {
    @Test
    void detectDup(){
        String filePath = "src/main/resources/largefile.csv";

        int duplicate=146993;
        assertEquals(DetectDuplicateCSV.detectDuplicates(filePath).size(),duplicate);
    }

    @Test
    void notFound(){
        String filePath = "src/main/resources/employees.csv";
        assertEquals(DetectDuplicateCSV.detectDuplicates(filePath).size(),0);

    }

}