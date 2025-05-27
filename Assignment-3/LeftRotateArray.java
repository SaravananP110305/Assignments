
import java.util.Scanner;

public class LeftRotateArray {

    public static void main(Strings[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 1 || n > 100) {
            System.out.println("Invalid array size!");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < -10000 || arr[i] > 10000) {
                System.out.println("Invalid array element!");
                return;
            }
        }

        int k = scanner.nextInt();
        if (k < 0 || k > 100) {
            System.out.println("Invalid rotation count!");
            return;
        }

        k = k % n;
        int[] rotated = new int[n];
        int index = 0;

        for (int i = k; i < n; i++) {
            rotated[index++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            rotated[index++] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }

        scanner.close();
    }
}
