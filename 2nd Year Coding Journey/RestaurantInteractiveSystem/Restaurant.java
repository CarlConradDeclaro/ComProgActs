   import java.util.*;
import java.text.DecimalFormat;
/*
author: carlconradeclaro
*/
class Store {
    
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Order> order = new ArrayList<>();
    
    // Initialize the default products and add-ons
    void defaultProduct(){
        Product prod1 = new Product("C1", 100.00, 0);
        Product prod2 = new Product("C2", 150.00, 0);
        Product prod3 = new Product("C3", 200.00, 0);
        
        Product addOns1 = new Product("R1", 35.00, 0);
        Product addOns2 = new Product("R2", 50.00, 0);
        
        // Add products and add-ons to the ArrayList
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(addOns1);
        products.add(addOns2);
    }
    
    // Print the menu (first three products)
    void printProducts(){
        int i = 0;
        System.out.println("\nMenu: ");
        for(Product prods : products){
            if(i < 3)
                System.out.println(prods.id + " - Php " + prods.price);
            i++;
        }
    }
    
    // Print the add-ons (products starting from the fourth)
    void printAddOns(){
        int i = 0;
        System.out.println("\nAdd Ons:");
        for(Product prods : products){
            if(i > 2)
                System.out.println(prods.id + " - Php " + prods.price);
            i++;
        }
    }
    
    private double totalPrice;
    // Print orders, calculate total price
    void printOrders(){
        totalPrice = 0;
        System.out.println("\nOrders: ");
        for(Order orders : order){
            double orderPrice = orders.price * orders.qty;
            System.out.println(orders.id + " - Php " + orders.price + " Qty: " + orders.qty);
            totalPrice += orderPrice;
        }
    }
    
     // Make an order based on user input
     void makeOrder(ArrayList<Product> prods, String ans, int qty){
         for(Product p : prods){
             if(p.id.equals(ans.toUpperCase())){
                  Order newOrder = new Order(p.id, p.price, qty); 
                  order.add(newOrder);
             }
         }
    }
    // Convert total price to dollars and return as a formatted string
    String getAmtToDollar(){
        double amount = totalPrice;
        DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
        return decimalFormat.format(amount / 56.81); //  P56.81 is the current amount of dollar to php
    }
    
    // Clear the order list
    void clearOrders(){
        order.clear(); // Clear the orders after the order is made
    }
}
class Product {
     String id;
     double price;
     int qty;
     Product(String id, double price, int qty){
         this.id = id;
         this.price = price;
         this.qty = qty;
     }
}
class Order {
    String id;
    double price;
    int qty;
    
    Order(){} // Default constructor
    
    // Constructor with parameters
    Order(String id, double price, int qty){
         this.id = id;
         this.price = price;
         this.qty = qty;
    }
}
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      Store store = new Store();
      Order order = new Order();
      store.defaultProduct();

      boolean run = true;
      boolean continueOrder = true;
      boolean addmore;
      boolean moreAddOns;
      do {
          if (continueOrder) {
                store.printProducts();
                    do{
                        System.out.print("Enter id to add product: ");
                        String ans = sc.nextLine();
                        System.out.print("Enter quantity: ");
                        int qty = Integer.parseInt(sc.nextLine()); 
                    
                        store.makeOrder(store.products, ans, qty);
                        System.out.print("Add more? (y/n): ");
                        String more = sc.nextLine().toLowerCase();
                        addmore = more.equals("y") ? true : false;
                    }while(addmore);
                        
                        System.out.println("\nDo you want some add ons? (y/n)");
                        String choice = sc.nextLine().toLowerCase();
                         
                    if (choice.equals("y")) {
                             store.printAddOns();
                                 do{
                                    System.out.print("Enter id to add product: ");
                                    String addOns = sc.nextLine().toUpperCase();
                                    System.out.print("Enter quantity: ");
                                    int qunty = Integer.parseInt(sc.nextLine());
                                    store.makeOrder(store.products, addOns, qunty);
                                               
                                    System.out.print("Add more? (y/n): ");
                                    String moreOns = sc.nextLine().toLowerCase();
                                    moreAddOns = moreOns.equals("y") ? true : false;
                                }while(moreAddOns);
                    }
                        store.printOrders();
                        store.clearOrders();
                              
                        System.out.println("Total amount: "+store.getAmtToDollar());
                        System.out.print("\nDo you want to order again? (y/n): ");
                        String answer = sc.nextLine().toLowerCase();
                           
                            if(answer.equals("n")) {
                                  continueOrder = false;
                                  run = false;
                            } else {
                                  continueOrder = true;
                            }
              }
        } while (run);
        System.out.println("Thank you!");
    }
}
