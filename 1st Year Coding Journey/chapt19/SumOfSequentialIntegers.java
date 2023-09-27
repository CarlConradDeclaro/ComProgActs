import java.util.Scanner;

class SumOfSequentialIntegers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        int N, Sum, x,count;
     
        System.out.println("Enter N: ");
        N = sc.nextInt();
    
        count =0;
        x = 1;
        Sum=0;
          
        while(count <N){  
           Sum +=x;   
            x+=1;    
           count+=1;    
          }
        int FormulaSum = (N*(N+1))/2;
    
        System.out.println("Loop sum = "+ Sum); 
        System.out.println("Formula sum = "+ FormulaSum); 
    
  }
}