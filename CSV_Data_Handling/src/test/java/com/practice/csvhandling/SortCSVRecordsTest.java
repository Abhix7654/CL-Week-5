package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCSVRecordsTest {
    @Test
    void sortFile(){
        String ans="108,Sneha Kapoor,IT,110000,sneha.kapoor@domain.co,9090909090\n" +
                "109,Arjun Mehta,Engineering,105000,arjunmehta@@company.com,7070707070\n" +
                "102,Muskan Pandey,IT,102000,muskan9234@gmail.com,7079973282\n" +
                "107,Vikram Patel,Operations,97000,vikram.patel@site,1112233\n" +
                "103,Rahul Sharma,Finance,95000,rahul.sharma@example,9876543210\n";

        String inPath = "src\\main\\resources\\employees.csv";

        assertEquals(SortCSVRecords.sortCSVFile(inPath),ans);

    }

}