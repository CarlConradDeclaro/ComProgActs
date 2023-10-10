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
           
            obstructed.add("Dumanjug");
             double TOA =0;
             
             System.out.println("Is Barili obstructed? (y/n) ");
             String obs = sc.nextLine();
             
             if(obs.equals("y")){
                 obstructed.add("Barili");
             }
             
             System.out.println("Enter Speed ");
             double speedy = sc.nextDouble();
             
            if(!(obstructed.contains("Barili"))){
                 Routes route13 = new Routes("SouthBustoCarcar",38.3);
                 Routes route341 = new Routes("CarCarToSibunga",18.1);
                 Routes route41413 = new Routes("BariliToMoaboal",30.3);
                 routes.add(route13);
                 routes.add(route341);
                 routes.add(route41413);
                 TOA =  computeTotalDistance(speedy,getDisTance());
                 
             }else if(!(obstructed.contains("Dumanjug"))){
                 Routes route13 = new Routes("SouthBustoCarcar",38.3);
                 Routes route341 = new Routes("CarCarToSibunga",18.1);
                 Routes route41413 = new Routes("BariliToMoaboal",30.3);
                 routes.add(route13);
                 routes.add(route341);
                 routes.add(route41413);
                 
             }else {
             
             }
             System.out.println("Speed: " + speedy);
             double dd = getDisTance();
             System.out.println("Total Distance: "+dd + "km");
             int hour = (int)TOA/60;
             int minutes = (int)TOA%60;
             System.out.println("Time of arrival: " + hour  +"hr,"+minutes + " minutes.");
    }
}

class Routes{
    String Place;
    double distance;
    Routes(){}
    Routes(String Place,double distance){
             this.Place = Place ;
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