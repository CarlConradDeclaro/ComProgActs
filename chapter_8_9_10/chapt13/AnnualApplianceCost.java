 import java.util.Scanner;



 class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner( System.in );
          

            double kilowatt_hour,kilowatt_HPY, annualCost;
            
            System.out.println("Enter cost per kilowatt-hour  in cents");
            kilowatt_hour = scan.nextDouble()/100;
            
            System.out.println("Enter kilowatt-hours used per year");
            kilowatt_HPY = scan.nextDouble();
            
            System.out.println("Annual cost: " + kilowatt_hour* kilowatt_HPY);
            
       
        
    }
}