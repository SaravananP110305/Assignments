
import java.util.Scanner;

public class TypeConversion {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = scanner.nextInt();

        System.out.print("Enter the Character: ");
        char letter = scanner.next().charAt(0);

        System.out.print("Enter the Float: ");
        float decimal = scanner.nextFloat();

        float result_1 = (float) number + decimal;
        System.out.println(number + " and " + decimal + '\t' + result_1);

        int result_2 = (int) letter + number;
        System.out.println(letter + " and " + number + '\t' + result_2);

        scanner.close();

    }
}
