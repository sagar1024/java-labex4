package financial;

public class FinancialApp {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount account = new SavingsAccount();

        // Deposit and withdraw from the account
        account.deposit(1000);
        account.withdraw(500);

        // Check the account balance
        double balance = account.checkBalance();
        System.out.println("Current balance: $" + balance);
    }
}
