
import java.util.Scanner;

public class Grade {

    public static void main(Strings[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = scanner.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade A");
        } else if (mark >= 75 && mark <= 89) {
            System.out.println("Grade B");
        } else if (mark >= 60 && mark <= 74) {
            System.out.println("Grade C");
        } else if (mark >= 40 && mark <= 59) {
            System.out.println("Grade D");
        } else if (mark < 40 && mark >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Input!");
        }
        scanner.close();
    }
}
