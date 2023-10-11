import java.util.*;

class RoutesDistance{
        Scanner sc = new Scanner(System.in);
        List<Routes> routes = new ArrayList<>();    
        List<String> obstructed = new ArrayList<>();

    double computeTotalDistance(double speed, double dis){
            double d = dis;
              return (d/ speed  ) * 60;
     }
    double getDisTance(){
        double dis=0;
        for(Routes d : routes)
             dis+=d.distance;
        return dis;
    }
    
     void printRoutes(){
           
            
             double TOA =0;
             
             System.out.println("Is Barili obstructed? (y/n) ");
             String obs = sc.nextLine().toLowerCase();
             
             if(obs.equals("y")){
                 obstructed.add("Barili");
                  System.out.println("Is Dumanjug obstructed? (y/n) ");
                  String ans = sc.nextLine().toLowerCase();
                  if(ans.equals("y")){
                       obstructed.add("Dumanjug");
                  }
             }
             
             System.out.println("Enter Speed ");
             double speedy = sc.nextDouble();
             
               Routes route1_2_3 = new Routes("SouthBus", "Carcar",38.3);
              
               Routes route3_41 = new Routes("CarCar","barili",17.5);
               Routes route41_411 = new Routes("barili","dumanjug",16.9);
               Routes route411_412 = new Routes("Dumanjug","Moalboal",13.3);
              
               

               

               Routes route3_42 = new Routes("CarCar","Sibunga",10.2);
               Routes route42_5 = new Routes("Sibunga","Argao",22.3);
               Routes route5_51 = new Routes("Argao","Ronda",21.4);
               Routes route51_52 = new Routes("Ronda","Moalboal",10.4);
            if(!(obstructed.contains("Barili"))){
                 routes.add(route1);
                 routes.add(route341);
                 routes.add(route41413);
                 TOA =  computeTotalDistance(speedy,getDisTance());
             }else if( !(obstructed.contains("Dumanjug"))){               
                 routes.add(route3);
                 routes.add(route2);
                 routes.add(route3);
                 TOA =  computeTotalDistance(speedy,getDisTance());
             }else {
                routes.add(route1_2_3);
                routes.add(route3_42);
                routes.add(route42_5);
                routes.add(route5_51);
                routes.add(route51_52);
                TOA =  computeTotalDistance(speedy,getDisTance());
             }
             
             System.out.println("Speed: " + speedy);
             double dd = getDisTance();
             System.out.println("Total Distance: "+dd + "km");
             int hour = (int)TOA/60;
             int minutes = (int)TOA%60;
             System.out.println("Time of arrival: " + hour  +"hr/s,"+minutes + " minutes.");
    }
}

class Routes{
        String startingPoint;
        String distination;
         double distance;
         Routes(){}
         Routes(String startingPoint,String distination,double distance){
             this.startingPoint = startingPoint ;
             this.distination = distination;
             this.distance =distance;
            }    
}

public class RoutesToMoalboal{
  public static void main (String[]args){
 
          RoutesDistance routeDistance = new RoutesDistance();
        
          System.out.println("Cebu City (South Bus) ");
          System.out.println("Route 1 Mingla");
          System.out.println("");
          
          routeDistance.printRoutes();
  }
}
