 import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 String name;
	 
	 System.out.print("Enter your name: ");
	 name = sc.nextLine().trim();
	 
     int x = name.lastIndexOf(" ");
     String c = name.substring(x).toUpperCase();
	 name =  name.substring(0,x);
	 
	 System.out.println(name+c);

	}
}