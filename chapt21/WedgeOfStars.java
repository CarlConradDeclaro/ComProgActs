 import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n;
     
      System.out.print("Inital number of stars: ");
      n = sc.nextInt();
    
         int counter = 0;
         int stars = n;
         int v =0;
           
            while(counter < n){
             v= counter;
               while(v < stars ){ 
                   System.out.print("*"); 
                     v++;                  
                  }
                   System.out.println(" "); 
                    counter++;                 
               }
      
      }
}