package financial;

public interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
