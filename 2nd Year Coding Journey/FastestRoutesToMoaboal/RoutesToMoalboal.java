 import java.util.*;

class FindShorstestRoutes{
        Scanner sc = new Scanner(System.in);
        List<Routes> routes = new ArrayList<>();    
        List<String> obstructed = new ArrayList<>();
        private double speedy;
        private double ETA;//ESTIMATED TIME OF ARRIVAL
        private int  hours;
        private int minutes;
        private double totalDistance;

        public FindShorstestRoutes computeTotalDistance(double speed, double dis){
            ETA = (dis/ speed  ) * 60;
            return this;
        }    
    
        public FindShorstestRoutes getHours(){
            hours = (int)ETA/60; 
            return this;
        }  

        public FindShorstestRoutes getMinutes(){
            minutes = (int)ETA%60;
            return this;
        }
        
        public double getSpeedy(){
            return speedy;
        }  

        public double computeDisTance(){
            totalDistance =0;
            for(Routes d : routes)
                totalDistance+=d.getDistance();
            return totalDistance;
        }

        public void findBestRoutes(){   

               getObstrutedRoutes();
               askSpeed();

               Routes route1 = new Routes("SouthBus", "Mingla",  "Start",14.2);
               Routes route2 = new Routes("Minglanilia", "San Fernando","Route 1",13.3);
               Routes route3 = new Routes("San Fernando", "Carcar", "Route 2",10.8);
               routes.add(route1);
               routes.add(route2);
               routes.add(route3);
              
               Routes route3_41 = new Routes("CarCar","barili","Route 3",17.8);
               Routes route41_411 = new Routes("barili","dumanjug","Route 4.1",16.9);
               Routes route411_412 = new Routes("Dumanjug","Moalboal\t-> \tRoute 4.1.2","Route 4.1.1",13.3);                                                                                                                                                                                                                                                                                                                                                            Routes route42_421 = new Routes("sibonga","dumanjug","Route 4.2",28.5);
               Routes route421_422 = new Routes("dumanjug","Moalboal\t-> \tRoute 4.2.2","Route 4.2.1",18.9);

               Routes route3_42 = new Routes("CarCar","Sibunga","Route 3",10.2);
               Routes route42_5 = new Routes("Sibunga","Argao","Route 4.2",22.3);
               Routes route5_51 = new Routes("Argao","Ronda","Route 5",21.4);
               Routes route51_52 = new Routes("Ronda","Moalboal\t-> \tRoute 5.2","Route 5.1",10.4);
        
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

        public void getObstrutedRoutes(){                 
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

        public void askSpeed(){
                System.out.println("Enter Speed ");
                speedy = sc.nextDouble();
        }
        public void displayRoutes(){
            System.out.println("\t <<< Best Routes >>>\n");   
            for(Routes r : routes){
                if(!(r.getStartingPoint().contains("SouthBus")))
                    System.out.printf("%-15s %-7s %-15s %.1f%n",r.getStartingPoint(),"->",r.getRoute() ,r.getDistance());
                else  
                    System.out.printf("%-15s %-7s %-15s%n",r.getStartingPoint(),"->",r.getRoute());
                if(r.getDistination() .contains("Moalboal"))   
                System.out.println(r.getDistination() +"\t"+r.getDistance()+"km");   
            }       
        }
        public void print(){
            System.out.println("\nSpeed: " +speedy);
            System.out.println("Total Distance: "+totalDistance + "km");
            System.out.println("Estimaed Time Of Arrival: " + hours  +"hr/s,"+ minutes + " minutes.\n");
        }
}

class Routes{
    private  String startingPoint;
    private String distination;
    private String route;
    private  double distance;
    
    Routes(){}
    Routes(String startingPoint,String distination,String route,double distance){
             this.startingPoint = startingPoint ;
             this.distination = distination;
             this.route =route;
             this.distance =distance;
    }    
    public String getStartingPoint(){return startingPoint;}
    public String getDistination() {return distination;}   
    public String getRoute() {return route;}   
    public double getDistance() {return distance;}       
}

public class RoutesToMoalboal{
  public static void main (String[]args){
          FindShorstestRoutes fRoutes= new FindShorstestRoutes();
          fRoutes.findBestRoutes();
          fRoutes.displayRoutes();      
          fRoutes.computeTotalDistance(fRoutes.getSpeedy(), fRoutes.computeDisTance()).getHours().getMinutes().print();       
  }
}
