import java.util.*; 

class  CorrectChange
{
  public static void main ( String[] args )
  { 
   Scanner scan = new Scanner( System.in );

    int dollars; // 100
    int quarter; // 25
    int dimes; // 10
    int nickels;// 5
    int cents;// 1

        
    int change;        
    System.out.println("Input the cents: ");
    change = scan.nextInt(); // 163
        
        
     dollars = change/100;     // 1 dollar    
     quarter = (change%100)/25 ;  // 2 quaters    
     dimes = (change%25)/10;  //1
     cents = (change%25)%5;// 3
     
     
     
   System.out.println( "Your change is : " + dollars + " dollar," + quarter + " quarters, "+ dimes +" dime, and "  + cents + " cents.");
       
        //  System.out.println(cents);
       
  }
}