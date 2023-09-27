import java.util.Scanner;

class SumRangeSquential {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        // Calculate the sum from one to high
        int sum_high = (high * (high + 1)) / 2;

        // Calculate the sum from one to (low-1)
        int sum_low = ((low - 1) * low) / 2;

        // Calculate the sum from low to high
        int sum_range = sum_high - sum_low;

        System.out.println("Sum = " + sum_range);
  }
}