import java.util.Random;  
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Random random = new Random();   
    Scanner sc = new Scanner(System.in);

    int scores =0;
 
    

        int counter =0;
        while(counter <10){
           // Generates random integers 0 to 100
           int x = random.nextInt(11);    
           int y = random.nextInt(11);   
           int product = x*y;
          
           System.out.println("\nWhat is " +x+" * " + y + "? " );   
           int ans = sc.nextInt();
    
          if(ans == product){
             System.out.println("Right!"  );   
             scores++;
          }else
              System.out.println("Wrong."+x+" * " + y + " is " + product  );   
        counter++;
       }     
     System.out.println("You got " +scores+" out of 10 questions correct!" );   
 
  }
}
