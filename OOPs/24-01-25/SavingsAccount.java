public class SavingsAccount extends BankAccount {
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
