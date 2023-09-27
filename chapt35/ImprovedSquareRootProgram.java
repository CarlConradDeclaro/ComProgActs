import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String response;
        
        do {
            double num;
            do {
                System.out.print("Enter a number --> ");
                num = sc.nextDouble();
                if (num <= 0) {
                    System.out.println(">>>number must be positive<<<");
                }
            } while (num <= 0);

            double root = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + root);

            do {
                System.out.print("Do you wish to continue (yes or no)? ");
                response = sc.next().toLowerCase();
                if (!response.equals("yes") && !response.equals("no")) {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!response.equals("yes") && !response.equals("no"));
            
        } while (response.equals("yes"));

        System.out.println("Bye");
    }
}