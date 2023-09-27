import java.util.Scanner;

public class MicrowaveOven
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

         System.out.print("How many items to heat: ");
         int items = sc.nextInt();
         
         System.out.print("Time for one item: ");
         int heatingTime = sc.nextInt();
         
         int toMinutes = heatingTime/100;
         int remainigSeconds = heatingTime%100;
         int seconds = toMinutes*60 +remainigSeconds;
         
         int z,c=0,v =0;

         if(items == 1){
            System.out.print("Heat for " +c+" minutes "+heatingTime+" seconds ");
         }
         if(items == 2){
             z = heatingTime + (heatingTime/2);
             c =  z/60;
             v =  z%60;     
            System.out.print("Heat for " +c+" minutes "+v+" seconds ");
         }
          if(items == 3){
             z = seconds*2;
             c = z/60;
             v = z%60; 
             System.out.print("Heat for " +c+" minutes "+v+" seconds ");
         }
         if(items > 3){          
               System.out.print("Heating more than three items at once is not recommended.");
         }
	}
}