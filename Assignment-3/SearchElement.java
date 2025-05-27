
import java.util.*;

public class SearchElement {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        if (size < 1 || size > 100) {
            System.out.println("Invalid array size!");
            return;
        }

        int[] array = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < -10000 || array[i] > 10000) {
                System.out.println("Invalid array element!");
                return;
            }
        }

        System.out.print("Enter the search element: ");
        int searchElement = scanner.nextInt();
        if (searchElement < -10000 || searchElement > 10000) {
            System.out.println("Invalid search element!");
            return;
        }

        int count = 0, index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                index = i;
                count++;
                break;
            } else {
                continue;
            }
        }

        if (count == 1) {
            System.out.println("The Index of the given search element is " + index);
        } else {
            System.out.println("Not Found!");
        }
        scanner.close();
    }
}
