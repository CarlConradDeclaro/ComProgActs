package SetsCalculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Evaluator {
    
    SetsElements setElements = new SetsElements(); 
    HashMap<String, List<String>> newHashMap;
    List<String> A = new ArrayList<>();
    List<String> B = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    Evaluator(){}
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

    void displaySymbols(){
        System.out.println("\nSYMBOLS\n");
        String Operation[] = {"1 union","2 intersection" ,"3 subset" ,"4 not Subset",
        "5 superset","6 not Superset","7 emptySet", "8 equal","9 not Equal","10Complement","11 difference",
        "12 element","13 not Element"};

        for (String op : Operation) {
             System.out.println(op.toUpperCase());
        } 
    }

    public void evaluateSets(){
         System.out.println("Enter Operation: ");
         
         switch(sc.nextInt()){
                case 1 :
                     getA().getB().UNION();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
                case 8 :
                    break; 
                case 9 :
                    break;
                case 10 :
                    break;
                case 11 :
                    break;
                case 12 :
                    break;
                case 13 :
                    break; 
                default:
                  System.out.println("");          
         }
    }

    public void UNION(){ 
         System.out.println(A.equals(B));
    }


    Evaluator getA(){         
            for(Map.Entry<String,List<String>> hashmap : newHashMap.entrySet()){      
                    List<String> values = hashmap.getValue();
                    if(hashmap.getKey() == "A")
                        for(String value : values) {
                            A.add(value);
                        }      
                }
           return this;   
        }
      
        Evaluator getB(){     
            for(Map.Entry<String,List<String>> hashmap : newHashMap.entrySet()){      
                    List<String> values = hashmap.getValue();
                    if(hashmap.getKey() == "B")
                        for(String value : values) {
                            B.add(value);
                        }      
                }
                return this;
            }

    public void setExpression(){
    }  

    public HashMap<String,List<String>> getNewhashMap(){
            return newHashMap;
     }   
     
        
           
       
    

    

}
