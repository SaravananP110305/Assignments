
import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Alphabet: ");
        char letter = scanner.next().charAt(0);

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a Vowel.");
        } else {
            System.out.println(letter + " is a Consonant.");
        }
    }
}
