public class Customer {
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