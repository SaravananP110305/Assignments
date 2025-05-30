
import java.util.*;

public class StrPalindromeUsingRecurFunc {

    static String strPalindrome(String str) {

        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String result = strPalindrome(str);
        System.out.println("The reversed string is: " + result);
    }
}
