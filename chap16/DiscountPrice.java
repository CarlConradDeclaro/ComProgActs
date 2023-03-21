import java.util.Scanner; 

class  DiscountPrice
{
  public static void main ( String[] args )
  { 
   Scanner sc = new Scanner( System.in );

  int purchaseAmt,toDollar ,discount,total;
  
        System.out.println("Enter amount of purchases: ");
       purchaseAmt = sc.nextInt();
       
       int toDolar = purchaseAmt/100;
       
       if(toDolar >= 10){
          discount = purchaseAmt/10;
          total = purchaseAmt-discount;
         System.out.println("Discounted price: " + total);
       }else 
        System.out.println(purchaseAmt);

       
  }
}