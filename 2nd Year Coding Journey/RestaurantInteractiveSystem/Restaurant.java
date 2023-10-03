   import java.util.*;





class Store {
    
    ArrayList<Product> products = new ArrayList<>();
    
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
    
    
    void printOrders(ArrayList<Product> orders){
        System.out.println("\nOrders: ");
          for(Product order : orders){
              System.out.println(order.id +" - Php " + order.price + " Qty: " + order.qty );
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
    
    ArrayList<Product> order = new ArrayList<>();
    
    
    void makeOrder(ArrayList<Product> prods,String ans, int qty){
         for(Product p : prods){
             if(p.id.equals(ans.toUpperCase())){
                  p.qty = qty;     
                  order.add(p);
             }
         }
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
        int qty = Integer.parseInt(sc.nextLine()); // Read the integer and consume the newline

        order.makeOrder(store.products, ans, qty);

        System.out.println("Do you want some add ons? (y/n)");

        String choice = sc.nextLine().toLowerCase();
        if (choice.equals("y")) {
            store.printAddOns();
            System.out.println("Enter id to add product: ");
            String addOns = sc.nextLine().toUpperCase();
            System.out.println("Enter quantity: ");
            int qunty = Integer.parseInt(sc.nextLine()); // Read the integer and consume the newline

            order.makeOrder(store.products, addOns, qunty);
        }
           
         store.printOrders(order.order);
         System.out.println("Do you want to order again? (y/n): ");
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
