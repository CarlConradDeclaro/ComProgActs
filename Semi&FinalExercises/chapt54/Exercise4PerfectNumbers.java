 import java.util.Scanner;
public class Exercise4PerfectNumbers

{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int input = sc.nextInt();	
	 if(isPerfect(input)){
	      System.out.println("Perfect Number");
	 }else
	      System.out.println("Not perfect Number");

	}
	
	
	public static boolean isPerfect(int x){
	    
	    int num = x, v=0;
     	for (int i=1; i<num; i++ ){
    	    if(num%i == 0){
    	        v+=i;
    	    }
    	}
	
       if(v == num){
    	   return true;
       }else
           return false;	
	}
}