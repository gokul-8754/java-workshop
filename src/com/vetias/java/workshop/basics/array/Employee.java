package arrayy; 
import java.util.Arrays; 
public class Employee { public static void main(String[] args) 
    { String[][] employees=new String [10][2];  
        employees [0][0]="naveen";
        employees [0][1]="2017"; 
        employees [1][0]="nithish";
        employees [1][1]="2023"; 
        employees [2][0]="surya";
        employees [2][1]="2024";
            for(String[] employee : employees)
            { System.out.println(Arrays.toString(employee)); } 
    }
}

