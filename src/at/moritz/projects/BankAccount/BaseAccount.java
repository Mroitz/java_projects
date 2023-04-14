package at.moritz.projects.BankAccount;

public class BaseAccount {
    private int balance;

    public BaseAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void returnBalance(){
        System.out.println(balance);
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int deposit){
        setBalance(getBalance()+deposit);
        System.out.println(balance + "$ have been deposited");
    }
}
