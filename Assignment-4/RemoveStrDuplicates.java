import java.util.Scanner;

public class RemoveStrDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        StringBuilder str1 = new StringBuilder(str);

        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    str1.replace(j, j + 1, "");
                }
            }
        }

        System.out.println(str1);
    }
}
