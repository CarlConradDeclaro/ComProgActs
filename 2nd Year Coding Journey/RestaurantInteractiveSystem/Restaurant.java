import java.util.*;
import java.io.*;

class Store{
     
    ArrayList<Product> products  = new ArrayList<>();
    
 
    void defaultProd(){
        Product prod1 = new Product(1,"C1 - PHP", 100.00);
        Product prod2 = new Product(2,"C2 - PHP", 150.00);
        Product prod3 = new Product(3,"C3 - PHP", 200.00);
        
        Product addOns1 = new Product(4,"R1 - PHP", 35.00);
        Product addOns2 = new Product(5,"R2 - PHP", 50.00);
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(addOns1);
        products.add(addOns2);
      
    }
 
  

}

class Product extends Store{

   int id;
   String productId;
   double prodPrice;

   public Product(int id,String productId,double prodPrice ){
    this.id =id;
    this.productId = productId;
    this.prodPrice = prodPrice;
   }

}


class Order extends Store{


   public void order(){
     


   }


}





class Restaurant{
    public static void main(String[] args) {
        
    }
}
