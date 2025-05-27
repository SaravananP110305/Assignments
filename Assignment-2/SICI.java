
import java.util.Scanner;

public class SICI {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        int p = scanner.nextInt();

        System.out.print("Enter the Time: ");
        int n = scanner.nextInt();

        System.out.print("Enter the Rate of interest: ");
        float r = scanner.nextFloat();

        float SI = (p * n * r) / 100;
        float PCI = (float) (p * Math.pow((1 + r / 100), n));
        float CI = PCI - p;

        System.out.println("Simple Interest: " + SI);
        System.out.printf("Compound Interest: %.2f\n", CI);
        scanner.close();
    }
}
