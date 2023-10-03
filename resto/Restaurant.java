package resto;

import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {
    public static void main (String [] args) {
        ArrayList<Product> prod = new ArrayList();
        Product a = new Product();

        a.displayMenu();
        a.getProduct();
        a.printCart();

    }
}
class Product {
    Scanner sc = new Scanner(System.in);
    String productID;
    double price;
    ArrayList<Product> prod = new ArrayList<>();
       ArrayList<Product> cart = new ArrayList<>();
    Product () {

    }

    Product (String productID, double price) {
        this.productID = productID;
        this.price = price;
    }

    public void defProd() {
        Product p1 = new Product("C1", 100.00);
        Product p2 = new Product("C2", 150.00);
        Product p3 = new Product("C3", 200.00);

        Product add1 = new Product("R1", 35.00);
        Product add2 = new Product("R2", 50.00);
        
        prod.add(p1);
        prod.add(p2);
        prod.add(p3);
        prod.add(add1);
        prod.add(add2);

    }


    public void displayMenu() {
        System.out.println("Menu: ");
        defProd();
        for(Product prods : prod ){
            System.out.println("ID: " + prods.productID + " Price: " +  prods.price);
        } 
    }
    public void getProduct() {

         ArrayList<Product> orders  = prod;
      
        System.out.println("Choose a Product: ");
        String option = sc.nextLine();
        
    for(Product p : prod){
        if(option == p.productID ){
              cart.add(p);
        }
    }
       
    }


    void printCart(){
         defProd();
         for(Product prods : cart ){
            System.out.println("ID: " + prods.productID + " Price: " +  prods.price);
        } 
    }




}
