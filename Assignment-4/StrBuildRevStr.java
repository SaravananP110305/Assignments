
import java.util.*;

public class StrBuildRevStr {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string: ");  
    String original = sc.nextLine();
    StringBuilder str = new StringBuilder(original);

    System.out.println("The reversed string: " + str.reverse());
  }
}
