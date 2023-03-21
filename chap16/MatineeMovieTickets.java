 import java.util.Scanner;
 
 class MatineeMovieTickets{
	public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
       
      int age,time,hour,minutes;

       double nChildTicket = 4.00;
       double aChildMatinee= 2.00;      
       double nAdultTicket = 8.00;
       double adultMatinee = 5.00;    
        
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter time: ");
        time = sc.nextInt();
     
         if(age<13){
           if(time<1700){
                System.out.print("The price is: " + aChildMatinee);
           }else{
               System.out.print("The price is: " + nChildTicket);
            } 
         }
         if(age>13){
            if(time <1700){
              System.out.print("The price is: " + adultMatinee);
             }else{
              System.out.print("The price is: " + nAdultTicket);
             }
         }     
   }
}