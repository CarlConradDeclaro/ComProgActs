import java.util.Scanner;
import java.text.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    DecimalFormat numform = new DecimalFormat("#0.00");

	    System.out.println("Enter the beginning balance: ");
        double balance = sc.nextDouble();

        System.out.println("Enter the monthly interest rate (as a decimal): ");
        double interestRate = sc.nextDouble();
        
        System.out.println("Enter the monthly payment: ");
        double payment = sc.nextDouble();
        
        int month = 0;
        double totalPayment = 0;

        while (balance > 0) {
            month++;
            balance += balance * interestRate;
            if (balance < payment) {
                payment = balance;
                balance = 0;
            } else {
                balance -= payment;
            }
            totalPayment += payment;
             System.out.println("Month " + month + ": balance = $" + numform.format(balance) + ", total payments = $" + numform.format(totalPayment));
            }
            
            System.out.println("Final payment: $" + numform.format(payment));
            System.out.println("Total number of months: " + month);
            	
	}
}
