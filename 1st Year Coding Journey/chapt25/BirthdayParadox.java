import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of guests: ");
        int n = input.nextInt();

        double probability = 1.0;
        for (int i = 1; i < n; i++) {
            probability *= (365.0 - i) / 365.0;
        }

        System.out.printf("Probability that no two guests share a birthday: %.2f%%\n", probability * 100);

        // Find the number of guests it takes for there to be more than a 50% chance
        int m = 1;
        probability = 1.0;
        while (probability > 0.5) {
            probability *= (365.0 - m) / 365.0;
            m++;
        }

        System.out.printf("To have a probability > 50%% that two of %d guests share a birthday, " +
                "you need at least %d guests.\n", m-1, m);
    }
}