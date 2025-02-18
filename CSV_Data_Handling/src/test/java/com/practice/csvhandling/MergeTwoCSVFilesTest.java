package com.practice.csvhandling;

import org.junit.jupiter.api.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoCSVFilesTest {

    String students1Path = "src/main/resources/student1.csv";
    String students2Path = "src/main/resources/student2.csv";
    String outputPath = "src/main/resources/merged_students.csv";

    @Test
    void testMergeCSVFiles() throws IOException {
        MergeTwoCSVFiles.mergeCSVFiles(students1Path, students2Path, outputPath);

        List<String> expectedOutput = Arrays.asList(
                "ID,Name,Age,Marks,Grade",
                "101,Abhishek Kumar,20,85,A",
                "102,Muskan Pandey,22,90,A+",
                "103,Rahul Sharma,21,78,B+",
                "104,Pooja Singh,23,88,A",
                "105,Amit Verma,24,92,A+"
        );
        List<String> actualOutput = Files.readAllLines(Paths.get(outputPath));

        assertEquals(expectedOutput, actualOutput);
    }
}
