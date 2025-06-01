class BankAccount {
    private double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        System.out.println("Balance: " + account.getBalance());

        // Uncommenting the below line will cause a compilation error
        // System.out.println("Direct balance access: " + account.balance);
    }
}
