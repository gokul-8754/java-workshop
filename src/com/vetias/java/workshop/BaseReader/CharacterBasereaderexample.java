package com.vetias.java.workshop.BaseReader;

import java.io.BufferedReader;
import java.io.IOException;

public class CharacterBasereaderexample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader("README.md"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
    }

}
    }
