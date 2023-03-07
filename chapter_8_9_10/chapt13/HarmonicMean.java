 import java.util.Scanner;

 public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   float X,Y;
            System.out.print("Enter X: ");
               X = sc.nextFloat();
            System.out.print("Enter Y: ");
               Y = sc.nextFloat();
            
            float arithmeticMean =(X+Y)/2;
            
            double harmonicMean = 2 / ( 1/X + 1/Y );
          
            System.out.println("Arithmetic mean: " + arithmeticMean);
            System.out.println("Harmonic   mean: " + harmonicMean);
     
	}
}
