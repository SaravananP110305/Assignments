
import java.util.Scanner;

public class BitwiseOperation {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter an Integer: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("NOT = " + (a != b));
        System.out.println("Left Shift = " + (a << b));
        System.out.println("Right Shift = " + (a >> b));
    }
}
