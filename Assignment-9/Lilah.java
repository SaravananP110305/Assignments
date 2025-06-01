
import java.util.*;

public class Lilah {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = "aba";
        int n = 10;

        String str2 = "";
        for (int i = 0; i < n; i++) {
            str2 += str1;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str2.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
