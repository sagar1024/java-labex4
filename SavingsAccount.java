package financial;

public class SavingsAccount implements Transaction {
    private double balance;

    @Override
    public void deposit(double amount) {
        // Implementation of deposit method
        balance += amount;
        // Additional logic related to deposit
    }

    @Override
    public void withdraw(double amount) {
        // Implementation of withdraw method
        if (balance >= amount) {
            balance -= amount;
            // Additional logic related to withdrawal
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double checkBalance() {
        // Implementation of checkBalance method
        return balance;
    }

    // Additional methods specific to SavingsAccount
    // ...
}
