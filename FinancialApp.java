import financial.*;

public class FinancialApp {
    public static void main(String[] args) {
        // Object of SavingsAccount
        SavingsAccount account = new SavingsAccount();

        // Deposit & withdraw from the account
        account.deposit(1000);
        account.withdraw(500);

        // Checking remaining balance
        double balance = account.checkBalance();
        System.out.println("Current balance is: $" + balance);
    }
}
