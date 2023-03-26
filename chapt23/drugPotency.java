import java.util.Scanner;
 

public class Main
{
	public static void main(String[] args) {
	    
	 Scanner sc = new Scanner(System.in);
     

	 double drugLooses = 0.04, effectivenes =100.0;
	 int month =0;
	 
	 System.out.printf("month: %10d effectiveness:  %10f \n ", month, effectivenes);
	 
        	 while(effectivenes >50){
        	     
        	     effectivenes  -= (effectivenes*drugLooses);
        	     month++;
        	    
        	     if(effectivenes<50){ 
                      System.out.printf("month: %10d effectiveness:  %10f DISCARDED\n ", month, effectivenes);
        	     }else
        	          System.out.printf("month: %10d effectiveness:  %10f \n ", month, effectivenes);
        	 }
        	
	}
}
