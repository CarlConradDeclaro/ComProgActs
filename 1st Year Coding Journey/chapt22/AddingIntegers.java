 import java.util.Scanner;
 
 class Main
{
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    int value;             // data entered by the user
    int sum = 0;           // initialize the sum

    // get the first value
    System.out.print( "Enter first integer (enter 0 to quit): " );
    value = scan.nextInt();

    if(value  != 0  ){
            while ( value != 0 )    
            {
              //add value to sum
              sum = sum + value;
        
              //get the next value from the user
              System.out.println( "Enter next integer (enter 0 to quit):" );
              value = scan.nextInt();      
            }
         System.out.println( "Sum of the integers: " + sum );
    }
    else
        System.out.println( "No integers were entered.\n bye "  );
       
   
  }
}