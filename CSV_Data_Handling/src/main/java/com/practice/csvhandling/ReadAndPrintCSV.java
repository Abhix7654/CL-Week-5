package com.practice.csvhandling;
import java.io.*;
import java.util.*;

public class ReadAndPrintCSV {
    public static void main(String[] args) {

        String filePath="src\\main\\resources\\input.csv";

        System.out.println(ReadCSV(filePath));

    }

    public static String ReadCSV(String path){
        StringBuilder sb=new StringBuilder();

        try(BufferedReader reader=new BufferedReader(new FileReader(path))) {

            String line;
            while ((line=reader.readLine())!=null){
                String[] columns = line.split(",");
                sb.append("ID-"+columns[0]+"  Name-"+columns[1]+"  Age-"+columns[2]+"  Marks-"+columns[3]+"\n");

            }

        }catch (IOException e) {
            e.printStackTrace();
        }





        return sb.toString();
    }
}
