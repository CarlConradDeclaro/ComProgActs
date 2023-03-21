import java.util.*; 

class OhmsLaw
{
  public static void main ( String[] args )
  { 
   Scanner scan = new Scanner( System.in );

    int V,R;
      
             
    System.out.println("Input the voltage: ");
    V = scan.nextInt();

    System.out.println("Input the resistance: ");

    R = scan.nextInt();
            
      double  I = (V + 0.0)/R;        
            
    System.out.println( I);
       
       
  }
}