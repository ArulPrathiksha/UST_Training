
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

class SavingsAccount extends BankAccount {
    /*
     * The SavingsAccount constructor is implicitly calling the no-argument
     * constructor of BankAccount using super(). However, BankAccount does not have
     * a no-argument constructor, so the compiler throws the error if the below
     * lines of code(7 to 9) is not given.
     */
    public SavingsAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully Deposited Rs." + amount + " to Savings Account . ");
        System.out.println("BALANCE : " + balance);

    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Successfully Withdrawn Rs." + amount + " from Savings Account . ");
            System.out.println("BALANCE : " + balance);
        } else {
            System.out.println("Not enough money to withdraw!!");
            System.out.println("BALANCE : " + balance);
        }
    }
}

class Customer {
    protected BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void displayBalance() {
        System.out.println("Account Balance : " + account.balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount(50000);
        Customer cust = new Customer(account);
        cust.displayBalance();
        cust.deposit(10050);
        cust.withdraw(15050);
    }
}