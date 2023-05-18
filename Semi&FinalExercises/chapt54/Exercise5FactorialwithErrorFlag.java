 import  java.util.Scanner;
 

public class Exercise5FactorialwithErrorFlag
{
  
  // Calculate num factorial
  public static long factorial( int num )
  {
    long fct = 1;
    for ( int j=1; j<=num; j++ )
      fct *= j;
    return  num >=21 || num<0 ? -1 :  fct;
  }
  
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    long fact; 
    int N;

    System.out.println( "To exit, enter a negative value" );
    System.out.print( "Enter N: " );
    N = scan.nextInt();

    while ( N >= 0 || N < 0)
    {
      fact = factorial( N );
      System.out.println( "factorial is " + fact );
      System.out.print( "Enter N: " );
      N = scan.nextInt();
    }
     
  }
}
