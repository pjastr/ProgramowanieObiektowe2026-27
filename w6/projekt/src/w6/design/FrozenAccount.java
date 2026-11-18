package w6.design;

public class FrozenAccount extends Account {
    public FrozenAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean canWithdraw(double amount) {   // stays within the contract
        return false;
    }

    // BAD alternative - breaks clients that rely on Account's contract:
    // @Override
    // public void withdraw(double amount) {
    //     throw new UnsupportedOperationException("Account is frozen");
    // }
}
