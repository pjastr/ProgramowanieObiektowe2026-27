package w6.payments;

public abstract sealed class Payment          // abstract: next lecture
        permits CardPayment, CashPayment, TransferPayment {
    private final double amount;

    protected Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
