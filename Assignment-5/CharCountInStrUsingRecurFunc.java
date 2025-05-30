
import java.util.Scanner;

public class CharCountInStrUsingRecurFunc {

    static int countChar(String str, char target, int index) {
        if (index >= str.length()) {
            return 0;
        }

        if (str.charAt(index) == target) {
            return 1 + countChar(str, target, index + 1);
        } else {
            return countChar(str, target, index + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the string: ");
        char target = sc.next().charAt(0);

        int result = countChar(str, target, 0);
        System.out.println("Count of '" + target + "' is: " + result);
    }
}
