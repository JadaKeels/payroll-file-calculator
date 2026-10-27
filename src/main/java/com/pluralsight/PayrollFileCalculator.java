package com.pluralsight;

import java.io.BufferedReader;
        import java.io.FileReader;
import java.nio.Buffer;

public class PayrollFileCalculator {
    public static void PayrollFileCalcultor(String[] args) {
        System.out.println("========== split; one line of text into its parts ==========");
        String line = "10|Dana Wyatt|52.5|12.50";

        String[] parts = line.split("\\|");

        System.out.println("Parts: " + parts.length);
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
        System.out.println();

        System.out.println("========== Read the emplyees.csv file: each line becomes an object ==========");
try {
    BufferedReader bufferedReader =new BufferedReader(new FileReader("employees.csv"));
    bufferedReader.readLine();

    String csvLine;
    while ((csvLine = bufferedReader.readLine()) !=null) {
        String[] tokens = csvLine.split("\\|");
        String id = tokens[0];
        String name = tokens[1];
        String hoursWorked = tokens[2];
        String payRate = tokens[3];

        Employee employee = new Employee(id,name, hoursWorked,payRate);


    }


