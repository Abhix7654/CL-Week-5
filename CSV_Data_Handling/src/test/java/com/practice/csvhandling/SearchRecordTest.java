package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchRecordTest {
    @Test
    void searchRec(){
        String filePath = "src\\main\\resources\\employees.csv";
        String target="Abhishek Kumar Muskan Pandey Sneha Kapoor";

        String ans="Name-Abhishek Kumar Department-Software Engineer Salary-80000\n" +
                "Name-Muskan Pandey Department-IT Salary-102000\n" +
                "Name-Sneha Kapoor Department-IT Salary-110000\n";

        assertEquals(SearchRecord.searchRecord(filePath,target),ans);
    }

}