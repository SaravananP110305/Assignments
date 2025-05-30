
import java.util.*;

public class StrPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String copy = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            copy += str.charAt(i);
        }

        if (str.equals(copy)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
