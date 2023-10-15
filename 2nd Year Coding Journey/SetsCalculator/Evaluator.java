package SetsCalculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Evaluator {
    
    SetsElements setElements = new SetsElements();
    
    HashMap<String, List<String>> newHashMap;
    
    Evaluator(HashMap<String, List<String>> sets){
            newHashMap = new HashMap<>(sets);
    }
    
    void displaySet(){

        for(Map.Entry<String,List<String>> hashmap : newHashMap.entrySet()){
                String key = hashmap.getKey();
                List<String> values = hashmap.getValue();
                System.out.print(key + " = ");
                System.out.print("{ ");
                    for(String value : values) {
                        System.out.print(value + " ");
                    }
                System.out.println(" }");
            }
    }


    public void setExpression(){

        

    }

    

}
