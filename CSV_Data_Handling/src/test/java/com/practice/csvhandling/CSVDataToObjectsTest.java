package com.practice.csvhandling;
import com.practice.csvhandling.convertcsvdatatoobjects.ConvertCSVToObjects;
import com.practice.csvhandling.convertcsvdatatoobjects.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
class CSVDataToObjectsTest {
        private String testFilePath;

        @BeforeEach
        public void setup() {
            testFilePath = "src/main/resources/employees.csv";
        }

        @Test
        public void testConvertCSVToEmployees() {
            List<Employee> employees = ConvertCSVToObjects.convertCSVToEmployees(testFilePath);

            assertNotNull(employees);
            assertFalse(employees.isEmpty());
            assertEquals(10, employees.size());

            Employee firstEmployee = employees.get(0);
            assertEquals("101", firstEmployee.getId());
            assertEquals("Abhishek Kumar", firstEmployee.getName());
            assertEquals("Software Engineer", firstEmployee.getDepartment());
            assertEquals("80000", firstEmployee.getSalary());

            Employee lastEmployee = employees.get(3);
            assertEquals("104", lastEmployee.getId());
            assertEquals("Pooja Singh", lastEmployee.getName());
            assertEquals("75000", lastEmployee.getSalary());

        }

    }
