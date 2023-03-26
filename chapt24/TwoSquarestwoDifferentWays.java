import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.print("N --> ");
        int n = input.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n / 2); i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (i * i + j * j == n) {
                count++;
                if (count == 1) {
                    System.out.printf("%d is the sum of 2 squares\n", n);
                }
                System.out.printf("%d == %d*%d + %d*%d\n", n, i, i, j, j);
            }
        }
        if (count == 0) {
            System.out.printf("%d is not the sum of 2 squares\n", n);
        }
        	
	}
}
