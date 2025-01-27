package Multiple_Objects_Interaction;

/*
 * Create a class Account with attributes accountNumber and balance. Add a
 * method transferAmount(Account recipient, double amount) to transfer money
 * between accounts. Test this by creating two objects.
 */

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void transferAmount(Account recipient, double amount) {
        if (balance >= amount) {
            this.balance -= amount;
            recipient.balance += amount;
            System.out
                    .println("Successfully Trasfered amount from " + accountNumber + " to " + recipient.accountNumber);
        } else {
            System.out.println("No Sufficient Balance in your account!!");
        }
    }

    public void disp() {
        System.out.println("Account Balance : " + balance);
    }
}

public class Transfer {
    public static void main(String[] args) {
        Account sender = new Account(125436, 50000);
        Account recipient = new Account(254315, 1000);
        System.out.print("Sender => ");
        sender.disp();
        System.out.print("Recipient => ");
        recipient.disp();
        sender.transferAmount(recipient, 20000);
        System.out.print("Sender => ");
        sender.disp();
        System.out.print("Recipient => ");
        recipient.disp();
    }
}