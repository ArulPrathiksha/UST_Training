/*
 * Design a base class Account with attributes accountNumber (public) and balance (protected). Create two subclasses:
 * SavingsAccount that adds an attribute interestRate, and CurrentAccount that adds an attribute overdraftLimit.
 * Write code to demonstrate the visibility of attributes (public, protected, and private) in both subclasses.
 */
class Account {
    public int accountNumber;
    protected double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void disp() {
        System.out.println("ACCOUNT CLASS : ");
        System.out.println("Account Number : " + accountNumber + "\nBalance : " + balance);
    }
}

class SavingsAccount extends Account {
    private int interestRate;

    SavingsAccount(int accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void disp() {
        System.out.println("SAVINGS ACCOUNT CLASS : ");
        System.out.println(
                "Account Number : " + accountNumber + "\nBalance : " + balance + "\nInterest Rate : " + interestRate);
    }
}

class CurrentAccount extends Account {
    int overdraftLimit;

    CurrentAccount(int accountNumber, double balance, int interestRate, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void disp() {
        System.out.println("CURRENT ACCOUNT CLASS : ");
        System.out.println("Account Number : " + accountNumber + "\nBalance : " + balance + "\nOver Draft Limit : "
                + overdraftLimit);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Account acc = new Account(254896355, 10000);
        acc.disp();
        System.out.println();
        SavingsAccount savingsAccount = new SavingsAccount(254631054, 50000, 2);
        savingsAccount.disp();
        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount(254631054, 50000, 2, 10000);
        currentAccount.disp();

    }
}