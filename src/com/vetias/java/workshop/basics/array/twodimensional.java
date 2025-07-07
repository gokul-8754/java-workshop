package com.vetias.java.workshop.basics.array;
import java.util.Arrays;

public class twodimensional {

    public static void main(String[] args) {
        String employeedetails[][]=new String[5][2];
        employeedetails[0][0]="101";
        employeedetails[0][1]="100000";
        employeedetails[1][0]="102";
        employeedetails[1][1]="100000";
        employeedetails[2][0]="103";
        employeedetails[2][1]="100000";
        employeedetails[3][0]="104";
        employeedetails[3][1]="100000";
        employeedetails[4][0]="105";
        employeedetails[4][1]="100000";
        for(String[]employee:employeedetails)
        {
            System.out.println(Arrays.toString(employee));
        }
    }
}


    

