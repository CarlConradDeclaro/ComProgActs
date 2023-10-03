  import java.util.*;

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



 void print(int x){
    
        
        System.out.println("Menu");
        int i=0;
        for(Product prodt : products){
        
          if(i <x){
               System.out.println(prodt.id +" "+ prodt.productId +" "+ prodt.prodPrice); 
          }
          i++;
        }
        
       }
 
 void printAddOn(){
        int i=0;
        System.out.println("Adds On");
        for(Product prodt : products){
        
          if(i >2){
               System.out.println(prodt.id +" "+ prodt.productId +" "+ prodt.prodPrice); 
          }
          i++;
        }
 }


}

class Product extends Store{

   int id;
   String productId;
   double prodPrice;

  
   Product(){}
   public Product(int id,String productId,double prodPrice ){
    this.id =id;
    this.productId = productId;
    this.prodPrice = prodPrice;
   }
   

}


class Order {


   public void order(){
     
   }


}

class Main{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       Store a = new Product();
       a.defaultProd();
      
       
       
          
          boolean run = true;
        do{
             a.print(3);
             System.out.println("Enter product: ");
             int choice = sc.nextInt();
             System.out.println("Enter Quantity: ");
             int quanty = sc.nextInt();
             
             System.out.println("Do you want to add more? (y/n)");
              sc.nextLine();
             String ans = sc.nextLine().toLowerCase();
             
             if(ans.equals("y")){
                  a.printAddOn();
                  System.out.println("Enter product: ");
                  int c = sc.nextInt();
                  System.out.println("Enter Quantity: ");
                  int q = sc.nextInt();
             }
            
           
            
         
       
        }while(run);
       
       
      

    }
}
