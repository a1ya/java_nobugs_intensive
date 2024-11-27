package Homework2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Not enough money to withdraw.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
