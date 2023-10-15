package SetsCalculator;

import java.util.HashMap;
import java.util.List;
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

    public void setSets(int s,int e){
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < e; j++) {
                
            }
        }
    }
    
    public void createSets(){
        System.out.print("How many Sets do you want to make? : ");
        int numOfSets = sc.nextInt();
        
        System.out.print("How many Element(s)? : ");
        int numOfElements = sc.nextInt();

          

    }


}





public class SetsCalcu {
    public static void main(String[] args) {
        
    }
}
