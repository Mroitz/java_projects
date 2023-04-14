package at.moritz.projects.BankAccount;

public class CheckingAccount extends BaseAccount{
    private int limit;

    public CheckingAccount(int balance, int Limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(int withdraw){
        if (getBalance() - withdraw <= limit){
            setBalance(getBalance() - withdraw);
            System.out.println(withdraw +"$ have been withdrawn");
        } else {
            System.out.println("exceeds limit");
        }
    }
}
