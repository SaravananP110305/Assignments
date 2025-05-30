import java.util.*;

public class CapitalFirstLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            if(i == 0) {
                result += Character.toUpperCase(str.charAt(i));
            }
            else if(str.charAt(i) == ' ') {
                result += ' ';
                result += Character.toUpperCase(str.charAt(i + 1));
                i++;
            }
            else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}