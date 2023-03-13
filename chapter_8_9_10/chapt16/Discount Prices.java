 import java.util.Scanner;  
 

  class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
         int amt,discount,total,amtToDollars; 
         
         System.out.println("Enter amount of purchases: ");
         amt = sc.nextInt();
        
         amtToDollars = amt/100;

         if(amtToDollars>=10){
             discount = amt/10;
             total = amt-discount;
             System.out.println("Discounted price: " + total);
         }else
            System.out.println("Total is: " + amt);
            
  }
}
