import java.util.Scanner;

 class SteamEngineEfficiency {
  public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);

         System.out.print("Enter the  air temperature : ");
         float Tair  = sc.nextFloat();
         
         System.out.print("Enter the steam temperature : ");
         float Tsteam = sc.nextFloat();
         
         float efficiency;
         if(Tsteam > 373){
              efficiency = 1- (Tair/Tsteam);
         }else{
             efficiency = 0;
         }
         
          efficiency *=100;
          
         System.out.println("The maximum possible efficiency of a steam engine is: " +  String.format("%.1f%%", efficiency)) ;
     
  }
}