package com.vetias.java.workshop.basics.beans;

public class TempertaureData {
    public static void main(String[] args) {
        TemperatureSensor tempvalue= new TemperatureSensor(18.9f);
        System.out.println(tempvalue.getReading());
    }


}
