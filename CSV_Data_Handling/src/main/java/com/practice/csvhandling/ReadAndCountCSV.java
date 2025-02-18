package com.practice.csvhandling;

import java.io.*;

public class ReadAndCountCSV {
    public static void main(String[] args) {

        String filePath = "src\\main\\resources\\input.csv";
        System.out.println(countRow(filePath));
    }

    public static int countRow(String path) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
