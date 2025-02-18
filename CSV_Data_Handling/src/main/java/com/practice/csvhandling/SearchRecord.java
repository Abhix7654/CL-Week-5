package com.practice.csvhandling;
import java.io.*;

public class SearchRecord {
    public static void main(String[] args) {
        String filePath = "src\\main\\resources\\employees.csv";
        String target="Abhishek Kumar Muskan Pandey Sneha Kapoor";

        System.out.println(searchRecord(filePath,target));
    }
    public static String searchRecord(String path,String target){
        StringBuilder sb=new StringBuilder();
        try(BufferedReader reader=new BufferedReader(new FileReader(path))){
            String line;
            while ((line=reader.readLine())!=null){
                String col[]=line.split(",");
                if(target.contains(col[1])){
                    sb.append("Name-"+col[1]+" Department-"+col[2]+" Salary-"+col[3]+"\n");
                }

            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        return sb.toString();
    }
}
