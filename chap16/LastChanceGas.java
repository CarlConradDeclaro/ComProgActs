import java.util.Scanner;  

  class LastChanceGas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
         int Tankcapacity;
         int Gage;
         int MilesPerGallon;
         
         System.out.println("Tank capacity: ");
         Tankcapacity = sc.nextInt();
         
         System.out.println("Gage reading: ");
         Gage = sc.nextInt();
         
         System.out.println("Miles per gallon: ");
         MilesPerGallon = sc.nextInt();
    
         int remainingMiles = (Tankcapacity*Gage /100)* MilesPerGallon;
         if(remainingMiles<=200){
              System.out.println("\nGet Gas! ");
         }else 
             System.out.println("\nSafe to Proceed ");
 
  }
}