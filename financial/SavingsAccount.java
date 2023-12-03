package financial;

public class SavingsAccount implements Transaction {
    private double balance;

    public void deposit(double amount) {
        // Deposit method
        balance += amount;
    }

    public void withdraw(double amount) {
        // Withdraw method
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double checkBalance() {
        // Using checkBalance method
        return balance;
    }
}
