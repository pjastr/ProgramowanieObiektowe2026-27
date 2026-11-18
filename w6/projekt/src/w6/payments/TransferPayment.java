package w6.payments;

public final class TransferPayment extends Payment {
    private final boolean express;

    public TransferPayment(double amount, boolean express) {
        super(amount);
        this.express = express;
    }

    public boolean isExpress() {
        return express;
    }
}
