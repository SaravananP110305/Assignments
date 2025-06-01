import java.util.*;

public class NonRepChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine().toLowerCase();  

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
