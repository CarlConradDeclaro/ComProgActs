 import  java.util.Scanner;
 

public class Main
{
 

  // Calculate num factorial
  public static long factorial( long num )
  {
    long fct = 1;
    
    for ( int j=1; j<=num; j++ )
      fct *= j;
    return  num >=21 || num<0 ? -1 :  fct;
  }
  
  public static void main (String[] args ) 
  {
    Scanner scan = new Scanner( System.in );
    
    long N,R,Nf,Rf,nR,NCR;

    System.out.println( "Compute NCR please Enter N and R" );
    System.out.print( "Enter N: " );
     N = scan.nextInt();
    System.out.print( "Enter R: " );
    R = scan.nextInt();
      // NCR = N! / (R!*(N-R)!)
    
    while ( N >= 0 || N < 0)
    {
       Nf = factorial( N );
       Rf = factorial( R);
       nR = factorial(N-R);
       NCR = Nf / (Rf*nR);
       long x =   Nf == -1 || Rf == -1 ?  -1 : NCR;
          System.out.println( "NCR is " + x );
          System.out.println( "\nCompute NCR please Enter N and R" );
          System.out.print( "Enter N: " );
          N = scan.nextInt();
          System.out.print( "Enter R: " );
          R = scan.nextInt();
    }
  }
}

 