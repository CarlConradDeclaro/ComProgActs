import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, sumOfOdds =0, b ;
        
        System.out.print("Enter an Integer N: ");
        n = sc.nextInt();
        
        for (int i=1; i<=n; i+=2){
            sumOfOdds+=i;
        } 
           System.out.println("Sum of odd numbers: " + sumOfOdds );
           System.out.println("Square of "+n + " is: " + n*n );
    }
}