import java.util.*; 

class  centsToDollars
{
  public static void main ( String[] args )
  { 
   Scanner scan = new Scanner( System.in );

    int cents;
    int dollars;
        
    int r;        
    System.out.println("Input the cents: ");
    r = scan.nextInt();
            
     cents= r%100;
     dollars = r/100;
     System.out.println( "That is " +  dollars + " dollars and " + cents + " cents.");
       
       
  }
}