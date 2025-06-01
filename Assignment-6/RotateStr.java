import java.util.*;

public class RotateStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string 2: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }

        String concatenated = s1 + s1;
        System.out.println(concatenated.contains(s2));
    }
}
