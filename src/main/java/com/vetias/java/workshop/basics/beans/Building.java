package com.vetias.java.workshop.basics.beans;
import java.time.LocalDateTime; 

public class Building {
    private String name;
    private double area;
    private int floors;
    private LocalDateTime opendatetime;
    private LocalDateTime closedatetime;
    public void setName(String aName)
        {
            name=aName;
        }
        public String getName()
        {
            return name;
        }
        public void setArea(double aArea)
        {
            area=aArea;
        }
        public double getArea()
        {
            return area;
        }
        public void setFloors(int aFloors)
        {
            floors=aFloors;
        }
        public int getFloors()
        {
            return floors;
        }
        public void setOpendatetime( LocalDateTime aOpendatetime )
        {
            opendatetime=aOpendatetime;
        }
        public  LocalDateTime getOpendatetime()
        {
            return opendatetime;
        }
        public void setClosedatetime( LocalDateTime aClosedatetime )
        {
            closedatetime=aClosedatetime;
        }
        public  LocalDateTime getCloseatetime()
        {
            return closedatetime;
        }

}



