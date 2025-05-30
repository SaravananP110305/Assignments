
import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the string 2: ");
        String str2 = sc.nextLine();

        String copy = "";

        for (int i = str2.length() - 1; i >= 0; i--) {
            copy += str2.charAt(i);
        }

        if((str1.equals(copy)) && (str1.length()  == str2.length())) {
            System.out.println("Anagrams");
        } 
        else {
            System.out.println("Not Anagrams");
        }
    }
}
