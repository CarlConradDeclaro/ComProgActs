import java.util.Scanner;

 class HarmonicSum {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n;
    double sum = 0;
    double harmonicSum = 1.0;
  
    System.out.print("Enter integer limit: ");
    n = sc.nextInt();
    
         int counter = 1;
         while(counter <= n){
              sum += harmonicSum/counter;       
              counter++;       
            }
         System.out.print("The sum is: " + sum);       
      }
}