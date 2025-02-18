package com.practice.csvhandling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateCSVDataTest {
    @Test
    void validateData(){
        String ans="Invalid Phone Number: 1112233 in row: 107,Vikram Patel,Operations,97000,vikram.patel@site,1112233\n" +
                "Invalid Email: arjunmehta@@company.com in row: 109,Arjun Mehta,Engineering,105000,arjunmehta@@company.com,7070707070\n" +
                "Invalid Phone Number: 12345 in row: 110,Kiran Das,Support,65000,kiran.das@domain.com,12345\n";

        String inPath = "src\\main\\resources\\employees.csv";
        assertEquals(ValidateCSVData.validateCSVData(inPath),ans);
    }

}