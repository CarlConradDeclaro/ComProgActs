import java.util.*;


class Exercise_1PayrollProgram {

    public static void main(String[] args) {
    
    Formatter formatter = new Formatter(); 
    
    int April;
    int May;
    int June;
    
    April = 12;
    May = 14;
    June = 8;
    
    System.out.println("Rainfall for April:\t" + April);
    System.out.println("Rainfall for May:\t" + May);
    System.out.println("Rainfall for June:\t" + June);

    
     double AvgRainFall = (double)(April+May+June)/3;
     //  System.out.println("Average rainfall: %.2f   ", AvgRainFall);
    
    formatter.format("Average rainfall: %.6f",AvgRainFall );
    System.out.println(formatter);  
   
     }
}
