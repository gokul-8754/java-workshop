package com.vetias.java;

public class Calculator {



    public int divide(int a, int b) {
        try{
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");

        } 
    }
           catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

          return 0;
    }
        return a / b;
    }
      public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Division"+ calculator.divide(10, 2)); 
        System.out.println("Division"+ calculator.divide(10, 0)); 


      }

}
