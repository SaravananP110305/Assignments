
import java.util.*;

public class Chocolate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        int in = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[in++] = arr[i];
            }
        }

        while (in < n) {
            arr2[in++] = 0;
        }

        System.out.println(Arrays.toString(arr2));
    }
}
