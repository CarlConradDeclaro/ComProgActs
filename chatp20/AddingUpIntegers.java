import java.util.Scanner;

public class AddingUpIntegers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numOfTimes;
    int sum= 0;
     
    
    System.out.print("How many integers will be added: ");
    numOfTimes = sc.nextInt();

         int counter = 0;
         while(counter < numOfTimes){
              System.out.print("Enter an integer: ");
              int num = sc.nextInt();
        
              sum+=num;
              counter++;       
        }
             System.out.print("The sum is: " + sum);
        
      }
}