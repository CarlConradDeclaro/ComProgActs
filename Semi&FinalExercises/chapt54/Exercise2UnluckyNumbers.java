 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
       
        
         System.out.print("Enter a nonnegative integer (-1 to exit): ");
         long v = sc.nextLong();
         
         while( v >= 0 ){

          if( isOdious(v)){
              System.out.println("unlucky");
          }else
             System.out.println("lucky ");
          
         System.out.print("Enter a nonnegative integer (-1 to exit): ");
          v = sc.nextLong();
           
      }
     
	}
	
	public static  boolean isOdious(long y){
   
      String x = String.valueOf(y);
     
	    if( x.contains("13")){
	       return true;
	    }else{
	     return false ;
	    }
	    
	}
}
