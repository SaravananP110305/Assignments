
import java.util.Scanner;

public class AllPrimeNum {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                int count = 0;
                for (int j = 1; j <= number; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
