import java.util.Scanner;
class TownDump {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   int unitsOfWeight,amt;
    double ounces,kilograms;
    double pounds=0;;
    
   // System.out.print("Choose what units of weight: \n1 => ounces to pounds \n2 => kilograms to pounds ");
   //    unitsOfWeight = sc.nextInt();

   //  if(unitsOfWeight == 1){
   //     System.out.println("Enter ounces: ");
   //     ounces = sc.nextDouble();
   //     pounds =  ounces/16;
   //  }
   //  if(unitsOfWeight == 2){
   //    System.out.println("Enter kilograms: ");
   //     kilograms = sc.nextDouble();
   //     pounds = kilograms/0.453592;
   //  }
    
   System.out.print("Enter the weight of your load of trash in pounds: ");
    pounds = sc.nextDouble(); 
     
      if((int)pounds >= 300){ 
         int add =(int) pounds-200; 
         int m = add/100;     
          amt = 20 +( 8*m);
      }else{
        amt =20;
      }

      System.out.println("Pounds is: "  +pounds );
      System.out.println("Total charge is: $"  +amt );
  }
}