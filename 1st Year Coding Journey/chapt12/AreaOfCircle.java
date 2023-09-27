import java.util.*; 

class AreaOfCircle
{
  public static void main ( String[] args )
  { 
   Scanner scan = new Scanner( System.in );

    int r;  
    final double PI = Math.PI;         
    System.out.println("Input the radius: ");
    r = scan.nextInt();
            
    double areaOfCircle = PI*(r*r);// the value of circle
    System.out.println( areaOfCircle);
       
       
  }
}