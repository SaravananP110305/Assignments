
import java.util.Scanner;

public class CountNoOfDigUsingRecurFunc {

    static int digit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + digit(n / 10);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int result = digit(n);
        System.out.println("No. of digits in the given number is: " + result);
    }
}
