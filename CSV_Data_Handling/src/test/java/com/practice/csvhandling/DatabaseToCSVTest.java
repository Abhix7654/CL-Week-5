package com.practice.csvhandling;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.sql.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseToCSVTest {

    @Test
    void testExportDatabaseToCSV() {
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/company_db?useSSL=false";
        String user = "Abhi";
        String password = "Abhi@123";
        String filePath="src\\main\\resources\\output.csv";
        DatabaseToCSV.exportDatabaseToCSV(dbUrl, user, password, filePath);
        assertTrue(Files.exists(Paths.get(filePath)));
    }

}
