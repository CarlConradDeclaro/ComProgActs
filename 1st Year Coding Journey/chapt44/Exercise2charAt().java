import java.util.Scanner;

public class Main
{
    
     public static void Exercise2(String input){
        	for(int i=0; i<input.length(); i++){
		    char x = input.charAt(i);
		    System.out.println(x);
		}
    }
    
    
    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    String input;
 		System.out.print("Enter a String: ");
		input = sc.nextLine();
		
		Exercise2(input);
	
		
		
	}
}


 




