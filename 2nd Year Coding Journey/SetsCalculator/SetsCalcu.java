package SetsCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Sets{  
    // 
    String name;
    List<String> sets;
    Sets(String name,List<String>sets){
        this.name =name;
        this.sets =sets;
    }
}


class SetsElements{
        
    HashMap<String,List<String>> sets = new HashMap<>();
    Scanner sc = new Scanner(System.in); 

    public List<String> setSets(){
        List<String> elements = new ArrayList<>();

        boolean run = true;
         System.out.println("Enter -1 to stop");
         System.out.println("Enter element: ");
          
        do{
            String ans = sc.nextLine();
           
            if(!ans.equals("-1")){
               elements.add(ans);
            }else 
               run = false;

        }while(run);

        return elements;
    }
    
    public void createSets(){
       
       boolean run = true; 
      do{
        System.out.print("Enter name of the set: "); 
        String name = sc.nextLine();
        sets.put(name,setSets());

        System.out.print("Do you want to Create another Set? (y/n) ");
        String ans = sc.nextLine();
        if(ans.equals("n"))
          run = false;

      }while(run);
        
         

    }

    public void displaySets(){

      for(Map.Entry<String,List<String>> hashmap : sets.entrySet()){
          String key = hashmap.getKey();
          List<String> values = hashmap.getValue();
          System.out.print(key + " = ");
          System.out.print("{ ");
            for (String value : values) {
                System.out.print(value + " ");
            }
          System.out.println(" }");
      }

    }


}


public class SetsCalcu {
    public static void main(String[] args) {
        SetsElements setElements = new SetsElements();
        setElements.createSets();
        setElements.displaySets();
    }
}
