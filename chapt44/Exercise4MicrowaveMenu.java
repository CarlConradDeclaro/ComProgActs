import java.util.Scanner;

public class Main
{
    
  public static void Exercise4MicrowaveM(int t){
              
          int m,s;
          m = t/100;
          s = t%100;
                 
            if( t>100 ){
                  System.out.println("Your time->  " + m+":"+s);
             }else if(t <100){
                  System.out.println("Your time->  " + "0:"+s);
          }
       }
  
  
  public static void main(String[] args) {
          
           Scanner sc = new Scanner(System.in);
        
           System.out.println("Enter cook time-> ");
           int  time  = sc.nextInt();
            
    	   Exercise4MicrowaveM(time);
 	
	}
}

 