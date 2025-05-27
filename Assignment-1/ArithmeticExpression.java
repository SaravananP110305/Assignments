
import java.util.Scanner;

public class ArithmeticExpression {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two Integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter the Double value: ");
        double c = scanner.nextDouble();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        int result = add + (int) c;
        System.out.println("Addition of Integer and Double: " + result);
    }
}
