import java.util.Scanner;

public class WordCountManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter target the string: ");
        String word = scanner.nextLine();

        int count = 0;
        int i = 0;
        int len = sentence.length();
        int wordLen = word.length();

        while (i <= len - wordLen) {
            boolean match = true;

            for (int j = 0; j < wordLen; j++) {
                if (sentence.charAt(i + j) != word.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                boolean isStartValid = (i == 0 || !Character.isLetterOrDigit(sentence.charAt(i - 1)));
                boolean isEndValid = (i + wordLen == len || !Character.isLetterOrDigit(sentence.charAt(i + wordLen)));

                if (isStartValid && isEndValid) {
                    count++;
                    i += wordLen;
                    continue;
                }
            }

            i++;
        }

        System.out.println("Total Count: " + count);
        scanner.close();
    }
}
