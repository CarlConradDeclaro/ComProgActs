  import java.util.Scanner;  

  class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
         int bolts,nuts,washers,total; 
         final int boltPrice = 5;
         final int nutsPrice = 3;
         final int washersPrice = 1;
         System.out.println("Number of bolts: ");
         bolts = sc.nextInt();
         
         System.out.println("Number of nuts: ");
         nuts = sc.nextInt();
         
         System.out.println("Number of washers: ");
         washers = sc.nextInt();
  
         total = bolts*boltPrice + nuts*nutsPrice + washers*washersPrice ;

        // check if order have at least as many nuts as bolts and at least twice as many washers as blots
         if(nuts<bolts){
            System.out.println("\nCheck the Order: too few nuts\n");
         }
         if(washers < 2*bolts){
            System.out.println("\nCheck the Order: too few washers\n");
         }
         if (nuts > bolts && washers > 2* bolts){
           System.out.println("\nThe program is Ok\n");
         }
             System.out.println("Total cost " + total);
  }
}
