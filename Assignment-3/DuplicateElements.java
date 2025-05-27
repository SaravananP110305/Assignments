
import java.util.Scanner;

public class DuplicateElements {

    public static void main(Strings[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean hasDuplicates = false;

        for (int i = 0; i < n - 1; i++) {
            if (visited[i]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                    visited[j] = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates");
        }

        scanner.close();
    }
}
