 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
       
        
         System.out.print("Enter a nonnegative integer (-1 to exit): ");
         long v = sc.nextLong();
         
         while( v >= 0 ){

          if( isOdious(v)){
              System.out.println("isEvil");
          }else
             System.out.println("isOdious ");
          
         System.out.print("Enter a nonnegative integer (-1 to exit): ");
          v = sc.nextLong();
           
      }
     
	}
	
	public static  boolean isOdious(long y){
   
	    if(y%2 == 0){
	       return true;
	    }else{
	     return false ;
	    }
	    
	}
}
