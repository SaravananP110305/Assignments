public class Calculator {
    int result;
    static int operationCount;

    void add(int a, int b) {
        result = a + b;
        operationCount++;
        System.out.println("Result: " + result);
    }

    static void displayOperationCount() {
        System.out.println("Total operations: " + operationCount);
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.add(5, 3);
        c2.add(10, 20);
        c1.add(7, 2);

        Calculator.displayOperationCount();
    }
}
