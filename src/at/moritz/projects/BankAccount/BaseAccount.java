package at.moritz.projects.BankAccount;

public class BaseAccount {
    private int balance;

    public BaseAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int deposit){
        this.balance += deposit;
        System.out.println(balance + "$ have been deposited");
    }
}
