
public class Account {

    private String name;
    private double balance;

    // Constructor
    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0) {
            this.balance = balance;
        } else {
            // do nothing
        }
    }

    // Methods
    public void deposit(double depositAmount) {
        if (depositAmount > 0 && ((balance - depositAmount) >= 0)) {
            balance -= depositAmount;
            System.out.println("Deposit : " + depositAmount + " $");
            System.out.println("You're balance is : " + balance + " $ remaining");
        } else {
            System.out.println("You're balance isn't enough for deposit " + depositAmount + " $");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName; 
    }

    public double getBalance() {
        return balance;
    }
}
