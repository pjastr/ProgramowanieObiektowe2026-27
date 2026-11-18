package w6.payments;

// final class BitcoinPayment extends Payment { }
// error: class is not allowed to extend sealed class: Payment
//        (as it is not listed in its 'permits' clause)

public class FeeCalculator {
    static double fee(Payment p) {
        return switch (p) {                       // no default needed
            case CardPayment c -> c.getAmount() * 0.015;
            case TransferPayment t when t.isExpress() -> 5.0;
            case TransferPayment _ -> 0.0;        // _ : unnamed variable
            case CashPayment _ -> 0.0;   // remove this line: error: the switch
        };                                // expression does not cover all possible input values
    }

    public static void main(String[] args) {
        Payment[] payments = {
            new CardPayment(200, "4111-1111"), new CashPayment(50),
            new TransferPayment(1000, true), new TransferPayment(300, false)
        };
        for (Payment p : payments) {
            System.out.println(p.getClass().getSimpleName() + " -> " + fee(p));
        }
    }
}
