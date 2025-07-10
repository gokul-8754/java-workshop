package com.vetias.java;

import java.util.Scanner;

public class Namegenerater {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender= scanner.nextLine();
        System.out.println("Enter your qualification:");
        String qualification = scanner.nextLine();
        if("Male".equalsIgnoreCase(gender)) {
            System.out.println(" Mr. " + name + ", your qualification is " + qualification);
        } else  {
            System.out.println(" Ms. " + name + ", your qualification is " + qualification);
        }
        
        






    }

    }


