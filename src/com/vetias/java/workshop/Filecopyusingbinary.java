package com.vetias.java.workshop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopyusingbinary  {
    public static void main(String[] args) {
        try(FileInputStream inputstream= new FileInputStream("Csk photo.jpg");
            FileOutputStream outputstream = new FileOutputStream("Mylogo.jpg")) {
            byte[] chunk = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputstream.read(chunk)) != -1) {
                outputstream.write(chunk, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("error in reading or writing file" );
            
        
        }
    }
}



