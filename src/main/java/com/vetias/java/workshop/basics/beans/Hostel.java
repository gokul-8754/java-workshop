package com.vetias.java.workshop.basics.beans;

public class Hostel extends Building {
    private boolean isMessAvailable;
    private int noOfRooms;
    public void setIsMessAvailable( boolean aIsMessAvailable)
    {
        isMessAvailable=aIsMessAvailable;
    }
    public boolean getIsMessAvailable()
    {
        return isMessAvailable;

    }
    public void setNoOfRooms( int aNoOfRooms)
    {
        noOfRooms=aNoOfRooms;
    }
    public int getaNoOfRooms()
    {
        return noOfRooms;

    }

    
}
