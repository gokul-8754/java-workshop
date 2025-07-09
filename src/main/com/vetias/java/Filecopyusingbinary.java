package com.vetias.java;

public class Filecopyusingbinary {
    public static void main(String[] args) {
        try(FileInputStream inputstream= new FileInputStream("README.md");
            FileOutputStream outputstream = new FileOutputStream("README_copy.md")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputstream.read(buffer)) != -1) {
                outputstream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            
        

}
