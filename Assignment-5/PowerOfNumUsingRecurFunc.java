import java.util.Scanner;

public class PowerOfNumUsingRecurFunc {

  static int power(int n, int pow) {
    if (pow == 0) {
      return 1;
    }
    return n * power(n, pow - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int n = sc.nextInt();

    System.out.print("Enter the power value: ");
    int pow = sc.nextInt();

    int result = power(n, pow);
    System.out.println(n + " power of " + pow + " is " + result);

    sc.close();
  }
}
