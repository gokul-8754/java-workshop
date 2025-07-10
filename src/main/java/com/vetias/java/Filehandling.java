package com.vetias.java;

import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file = new File("src");  
        if (file.isDirectory()) {
            System.out.println("It is a directory.");
          File[] files = file.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        }
        }

}
