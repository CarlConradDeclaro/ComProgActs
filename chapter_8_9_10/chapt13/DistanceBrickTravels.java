 import java.util.Scanner;



 class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner( System.in );
          
         double t;
         double g = 32.174;// acceleration due to gravity
         
         System.out.print("Enter the number of seconds: ");
         t = scan.nextDouble();
     
         double d = (double)1/2 * g* Math.pow(t,2);
        
         System.out.printf("Distance: %.3f",d);    
         
    }
}
