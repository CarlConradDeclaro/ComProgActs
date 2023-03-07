 import java.util.Scanner;

 public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
            System.out.print("Enter a double: ");
            double x = sc.nextDouble();
            double base2Log = Math.log(x) / Math.log(2);
            System.out.println(base2Log);
      
	}
}
