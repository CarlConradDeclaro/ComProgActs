import java.util.*;

class FindShorstestRoutes{
        Scanner sc = new Scanner(System.in);
        List<Routes> routes = new ArrayList<>();    
        List<String> obstructed = new ArrayList<>();
        private double speedy =0;

     void getObstrutedRoutes(){                 
             System.out.println("Is Barili obstructed? (y/n) ");
             String obs = sc.nextLine().toLowerCase();             
                if(obs.equals("y")){
                    obstructed.add("Barili");
                    System.out.println("Is Dumanjug obstructed? (y/n) ");
                    String ans = sc.nextLine().toLowerCase();
                    if(ans.equals("y"))
                        obstructed.add("Dumanjug");                 
                } 
     }

     void askSpeed(){
             System.out.println("Enter Speed ");
             speedy = sc.nextDouble();
     }
    
     void findBestRoutes(){   

               getObstrutedRoutes();
               askSpeed();

               Routes route1 = new Routes("SouthBus\t -> \tStart\t", "Mingla",14.2);
               Routes route2 = new Routes("Minglanilia\t -> \tRoute 1\t", "San Fernando",13.3);
               Routes route3 = new Routes("San Fernando\t -> \tRoute 2\t", "Carcar",10.8);
               routes.add(route1);
               routes.add(route2);
               routes.add(route3);
              
               Routes route3_41 = new Routes("CarCar\t\t -> \tRoute 3\t","barili",17.8);
               Routes route41_411 = new Routes("barili\t\t -> \tRoute 4.1","dumanjug",16.9);
               Routes route411_412 = new Routes("Dumanjug\t -> \tRoute 4.1.1","Moalboal\t -> \tRoute 4.1.2",13.3);
              
               Routes route42_421 = new Routes("sibonga\t\t -> \tRoute 4.2\t","dumanjug",28.5);
               Routes route421_422 = new Routes("dumanjug\t -> \tRoute 4.2.1\t","Moalboal\t -> \tRoute 4.2.2\n",18.9);

               Routes route3_42 = new Routes("CarCar\t\t -> \tRoute 3\t","Sibunga",10.2);
               Routes route42_5 = new Routes("Sibunga\t\t -> \tRoute 4.2\t","Argao",22.3);
               Routes route5_51 = new Routes("Argao\t\t -> \tRoute 5\t","Ronda",21.4);
               Routes route51_52 = new Routes("Ronda\t\t -> \tRoute 5.1\t","Moalboal\t -> \tRoute 5.2",10.4);
        
            if(!(obstructed.contains("Barili"))){   
                 routes.add(route3_41);
                 routes.add(route41_411);
                 routes.add(route411_412);  

             }else if( !(obstructed.contains("Dumanjug"))){                              
                 routes.add(route3_42);
                 routes.add(route42_421);
                 routes.add(route421_422);              
             }else {               
                routes.add(route3_42);
                routes.add(route42_5);
                routes.add(route5_51);
                routes.add(route51_52);            
             }         
    }  

    double computeTotalDistance(double speed, double dis){
        return (dis/ speed  ) * 60;
    }    

    double getSpeedy(){
        return speedy;
    }  

    int getHours(){
        return (int)(computeTotalDistance(getSpeedy(),getDisTance()))/60; 
    }  

    int getMinutes(){
        return (int)(computeTotalDistance(getSpeedy(),getDisTance()))%60;
    }

    double getDisTance(){
        double dis=0;
        for(Routes d : routes)
             dis+=d.distance;
        return dis;
    }
    
    void displayRoutes(){
        System.out.println("\t <<< Best Routes >>>\n");   
        for(Routes r : routes){
            if(!(r.startingPoint.contains("SouthBus")))
                     System.out.println(r.startingPoint +"\t\t"+r.distance+"km"); 
            else  
                System.out.println(r.startingPoint ); 
            if(r.distination.contains("Moalboal"))   
               System.out.println(r.distination+"\t\t"+r.distance+"km");   
        }       
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
          FindShorstestRoutes fRoutes= new FindShorstestRoutes();
          fRoutes.findBestRoutes();
          fRoutes.displayRoutes();       
          System.out.println("Speed: " +fRoutes.getSpeedy());
          System.out.println("Total Distance: "+fRoutes.getDisTance() + "km");
          System.out.println("Time of arrival: " + fRoutes.getHours()  +"hr/s,"+fRoutes.getMinutes() + " minutes.\n");
  }
}