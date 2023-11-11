package SetsCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Sets{  
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
          
        while(run){
            String ans = sc.nextLine();
           
            if(!ans.equals("-1")){
               elements.add(ans);
            }else 
               run = false;

        }

        return elements;
    }
    
    public void createSets(){

            System.out.println("Enter elements for the set A:  ");          
            sets.put("A",setSets());

            System.out.println("Enter elements for the set B:  ");
            sets.put("B",setSets());
     
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

    public HashMap<String,List<String>> getSets(){
        return sets;
    }
}

public class SetsCalcu {
    public static void main(String[] args) {
        SetsElements setElements = new SetsElements();
        setElements.createSets();
        setElements.displaySets();
      
        Evaluator ev = new Evaluator(setElements.getSets());
       
    }
}
