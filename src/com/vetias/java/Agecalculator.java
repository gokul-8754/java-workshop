package com.vetias.java;

public class Agecalculator {
    public static void main(String[] args) {
        

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear = scanner.nextInt();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age + " years");
    }

}
