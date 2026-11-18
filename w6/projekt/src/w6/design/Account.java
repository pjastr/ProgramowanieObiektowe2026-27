package w6.design;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean canWithdraw(double amount) {   // lets clients ask first
        return amount > 0 && amount <= balance;
    }

    public void withdraw(double amount) {
        if (!canWithdraw(amount)) {
            throw new IllegalArgumentException("Cannot withdraw " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
