package se.hb.bank;

public class Account {

    private int accountNumber;
    private double balance;
    private static int accounts;
    
    public Account() {
        this(0);
    }

    public Account(double balance) {
        this.balance = balance;
        accountNumber = accounts++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public double withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return amount;
        }
        return 0;
    }
}