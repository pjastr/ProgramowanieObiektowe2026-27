package w6.design;

import java.util.List;

public class LiskovDemo {
    static void payRent(Account account, double rent) {   // any Account
        if (account.canWithdraw(rent)) {
            account.withdraw(rent);
            System.out.println("paid, balance = " + account.getBalance());
        } else {
            System.out.println("cannot pay now");
        }
    }

    public static void main(String[] args) {
        payRent(new Account(2000), 1500);         // paid, balance = 500.0
        payRent(new FrozenAccount(2000), 1500);   // cannot pay now

        List<Integer> fixed = List.of(1, 2);
        try {
            fixed.add(3);                         // "optional operation"
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of(...).add: " + e.getClass().getSimpleName());
        }
    }
}
