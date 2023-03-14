import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
       
      int age,time,hour,minutes;

       double nChildTicket = 4.00;
       double aChildMatinee= 2.00;      
       double nAdultTicket = 8.00;
       double adultMatinee = 5.00;  
       double salesTicket  = 4.00;
        
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter hours: ");
        hour = sc.nextInt();
        System.out.println("Enter minutes: ");
        minutes = sc.nextInt();

        time =  (1200 + hour*100)+minutes;
        
      if(time > 2200 ){
            if(age>=13){
              System.out.print("The price is: " + salesTicket);
            }else
             System.out.print("No children may purchase tickets after 10pm." );
        }
      else{
          if(age < 13){
              if(time <1700){
                System.out.print("The price is: " + aChildMatinee);
                 }else
                    System.out.print("The price is: " + nChildTicket);
          }else if(time <1700){
                 System.out.print("The price is: " + adultMatinee);
          }
          else{
                System.out.print("The price is: " + nAdultTicket);
          }
      }
   }
}
