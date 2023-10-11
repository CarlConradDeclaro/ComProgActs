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
    void displayRoutes(){
        System.out.println("\t <<< Best Routes >>>\n");   
        for(Routes r : routes){
            if(!(r.startingPoint.contains("SouthBus")))
                 System.out.printf("%-15s %-7s %-15s %.1f%n",r.startingPoint,"->",r.route,r.distance);
            else  
                System.out.printf("%-15s %-7s %-15s%n",r.startingPoint,"->",r.route);
            if(r.distination.contains("Moalboal"))   
               System.out.println(r.distination+"\t"+r.distance+"km");   
        }       
    }
