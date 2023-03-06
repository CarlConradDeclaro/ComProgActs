 import java.util.Scanner;



 class FurSubstringFun{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String sentence;
        int s,e;
        
        System.out.println("Enter a string");
        sentence = sc.nextLine(); 
        
        System.out.println("Enter beginning index:");
        s = sc.nextInt(); 
        
        System.out.println("Enter ending index: ");
        e = sc.nextInt(); 
        
        System.out.println("Original string: " + sentence);
        System.out.println("Substring: " + sentence.substring(s,e));

        
        
    }
}