import java.util.Scanner;

public class MajorityElementFinder {

    public static int findMajorityElement(int[] arr) {
        int c = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    c = arr[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == c) count++;
        }

        if (count > arr.length / 2) {
            return c;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Majority elemnt is: " + findMajorityElement(arr));
    }
}
