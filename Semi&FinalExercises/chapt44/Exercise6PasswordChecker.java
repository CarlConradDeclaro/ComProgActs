import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    
	   System.out.println("Enter your password: ");
       String password = sc.nextLine();
       
       
      int n = password.length();
       
      if(n>=7){
            if( !password.equals(password.toUpperCase()) && !password.equals(password.toLowerCase())    ) {
               
 
            }else{
              System.out.println("2That password is not acceptable.");   
              }
       }else{
           System.out.println("1That password is not acceptable.");   
      }
         
          
     
	}
}
