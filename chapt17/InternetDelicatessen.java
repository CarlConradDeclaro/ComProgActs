import java.util.Scanner;
class InternetDelicatessen
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);

         System.out.print("Enter the item: ");
         String item = sc.nextLine();
         
         System.out.print("Enter the price: ");
         double price = sc.nextDouble();
         
         System.out.print("Express Delivery 0==no, 1==yes: ");
         int shping = sc.nextInt();
         
         double Delivery;
         double x = (price * 100);
         
          if(x<1000 ){
            Delivery = 200;
           }else{
               Delivery=0;
           }
          if(shping == 1){
                Delivery = Delivery+300;
           }  
             
          double deliveryFee = Delivery / 100;
          double total = deliveryFee +price;
   
         System.out.println("\nInvoice:");
         System.out.printf("%-10s:%10.2f",item,price);
         System.out.printf("\n%-10s:%10.2f","Delivery", deliveryFee);
         System.out.printf("\n%-10s:%10.2f" ,"Total", total);

	}
}