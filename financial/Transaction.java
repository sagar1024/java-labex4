package financial;

//An interface defining methods related to transactions
public interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
