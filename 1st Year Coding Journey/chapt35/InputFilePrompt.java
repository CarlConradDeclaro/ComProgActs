 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        while (true) {
            System.out.print("input file: ");
            fileName = scanner.nextLine().trim();

            if (fileName.isEmpty()) {
                System.out.println(">>>file name missing<<<");
                continue;
            }

            if (fileName.contains(" ")) {
                System.out.println(">>>file name must not contain spaces<<<");
                continue;
            }

            if (!fileName.endsWith(".dat")) {
                System.out.println(">>>file name must end with .dat<<<");
                continue;
            }

            break;
        }

        System.out.println("OK");
    }
}