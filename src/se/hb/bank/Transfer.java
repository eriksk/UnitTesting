package se.hb.bank;

import se.hb.bank.exceptions.TransferNotAllowedException;

public class Transfer {

    public static void transfer(Account fromAccount, Account toAccount, double amount) throws TransferNotAllowedException {
        double temp = fromAccount.withdraw(amount);
        if (amount != temp) {
            throw new TransferNotAllowedException("Amount not accepted from withdrawal.");
        } else {
            toAccount.deposit(temp);
        }
    }
}