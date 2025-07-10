package src.com.java.workshop.temperaturedata.beans;

public class Zone {
    private String name;
    private int zoneid;
    private String type;
    private double area;
    public void setName(String aName)
        {
            name=aName;
        }
        public String getName()
        {
            return name;
        }
        public void setZoneid(int aZoneid)
        {
            zoneid=aZoneid;
        }
        public int getZoneid()
        {
            return zoneid;
        }
        public void setType(String aType)
        {
            type=aType;
        }
        public String getType()
        {
            return type;
        }
         public void setArea(double aArea)
        {
            area=aArea;
        }
        public double getArea()
        {
            return area;
        }
        
    

}
