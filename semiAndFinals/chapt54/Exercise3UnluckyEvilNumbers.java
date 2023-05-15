 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in); 
       
        
        int upperLimit= 1000;  
        
        for(int i = 1; i <= upperLimit; i++){

          if( isEvil(i) && isUnlucky(i)  ){
              System.out.println(i +": Unlucky Evil Numbers");
          }
      }
     
	}

	
	public static  boolean isUnlucky(long y){
   
          String x = String.valueOf(y);
         
    	    if( x.contains("13")){
    	         return true;
    	      }else{
    	         return false ;
    	    }
	    
	}
	
	public static  boolean isEvil(long y){
	    
	     if(y%2 == 0){
    	       return true;
    	 }else{
    	     return false ;
    	   }
    	}

}