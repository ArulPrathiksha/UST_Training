/*
 * Create an abstract class “BankAccount” with abstract methods “deposit()” and “withdraw()”. 
 * Implement two subclasses “SavingsAccount” and “CheckingAccount” which extend “BankAccount” and implement the abstract methods. 
 * Create a “Customer” class which contains a list of “BankAccount” objects. 
 * Add methods to the “Customer” class to display account balances, deposit/withdraw money, etc. 
 * Create objects of all classes and test their behavior.
 */
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(50000);
        Customer cust = new Customer(account);
        cust.displayBalance();
        cust.deposit(10050);
        cust.withdraw(10050);
    }
}