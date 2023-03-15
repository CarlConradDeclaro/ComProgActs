 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

         System.out.println("Enter Wind Speed: ");
         int v = sc.nextInt();
         System.out.println("Enter Temperature:");
         int temp = sc.nextInt();

        
            if(v < 3){
              System.out.println(temp);
            }
     	    if(temp > 50){
               System.out.println(temp);  
            }
	     if(v < 3 == temp > 50) ){
               double windSpeed =  (35.74) + (0.6215*temp) - (35.75*( Math.pow(v,0.16)) ) + (0.4275*temp * Math.pow(v,0.16)) ;
             System.out.println(windSpeed);
            }
	}
}
