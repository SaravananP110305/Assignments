
import java.util.Scanner;

public class ToggleStr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str1 = sc.nextLine();
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if ((int) str1.charAt(i) >= 65 && (int) str1.charAt(i) <= 90) {
                str2 += Character.toLowerCase(str1.charAt(i));
            } else if ((int) str1.charAt(i) >= 97 && (int) str1.charAt(i) <= 122) {
                str2 += Character.toUpperCase(str1.charAt(i));
            }
        }

        System.out.println(str2);

    }
}
