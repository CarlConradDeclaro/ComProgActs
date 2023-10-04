     import java.util.*;
import java.text.DecimalFormat;




class Store {
    
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Order> order = new ArrayList<>();
    
    void defaultProduct(){
        Product prod1 = new Product("C1", 100.00,0);
        Product prod2 = new Product("C2", 150.00,0);
        Product prod3 = new Product("C3", 200.00,0);
        
        Product addOns1 = new Product("R1", 35.00,0);
        Product addOns2 = new Product("R2", 50.00,0);
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(addOns1);
        products.add(addOns2);
    }
    
    void printProducts(){
        int i=0;
        for(Product prods : products){
            if(i<3)
            System.out.println(prods.id +" - Php " + prods.price  );
            i++;
        }
    }
    
    void printAddOns(){
          int i=0;
          System.out.println("\nAdd Ons:");
        for(Product prods : products){
            if(i>2)
            System.out.println(prods.id +" - Php " + prods.price  );
            i++;
        }
    }
    
    private  double totalPrice;
    void printOrders(){
        totalPrice =0;
        System.out.println("\nOrders: ");
          for(Order orders : order){
              double orderPrice = orders.price * orders.qty;
              System.out.println(orders.id +" - Php " + orders.price + " Qty: " + orders.qty );
              totalPrice+=orderPrice;
             }
        }
    
    
    double getAmtToDollar(){
        double amount  = totalPrice;
        // DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
        return   amount;
         
    }
    
     void makeOrder(ArrayList<Product> prods,String ans, int qty){
         for(Product p : prods){
             if(p.id.equals(ans.toUpperCase())){
                  Order newOrder = new Order(p.id,p.price,qty);
                  order.add(newOrder);
             }
         }
    }
    
    
}

class Product extends Store {
     String id;
     double price;
     int qty;
     
     Product(String id,double price,int qty){
         this.id = id;
         this.price = price;
         this.qty= qty;
     }
    
}
class Order{
    String id;
    double price;
    int qty;
    Order(){}
    Order(String id,double price,int qty){
         this.id = id;
         this.price = price;
         this.qty= qty;
    }
}


public class Restaurant
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

Store store = new Store();
Order order = new Order();
store.defaultProduct();

boolean run = true;
boolean continueOrder = true;

do {
    if (continueOrder) {
        store.printProducts();
        System.out.println("Enter id to add product: ");
        String ans = sc.nextLine();
        System.out.println("Enter quantity: ");
        int qty = Integer.parseInt(sc.nextLine()); 

        store.makeOrder(store.products, ans, qty);

        System.out.println("\nDo you want some add ons? (y/n)");

        String choice = sc.nextLine().toLowerCase();
        if (choice.equals("y")) {
            store.printAddOns();
            System.out.println("Enter id to add product: ");
            String addOns = sc.nextLine().toUpperCase();
            System.out.println("Enter quantity: ");
            int qunty = Integer.parseInt(sc.nextLine());

            store.makeOrder(store.products, addOns, qunty);
        }
           
         store.printOrders();
         System.out.println("Total amount: "+store.getAmtToDollar());
         System.out.println("\nDo you want to order again? (y/n): ");
         String answer = sc.nextLine().toLowerCase();
       
        if (answer.equals("n")) {
            continueOrder = false;
            run = false;
        }else
          continueOrder = true;
    }
} while (run);

 	   
	  
	   
	  
	   
	   
	 
	    
	    
	}
}
