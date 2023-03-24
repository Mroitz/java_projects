package at.moritz.projects.BankAccount;

public class CheckingAccount extends BaseAccount{
    private int balance;
    private int limit;

    public CheckingAccount(int balance, int Limit) {
        super(balance);
        this.limit = limit;
    }

    public void withdraw(int withdraw){
        if (balance - withdraw >= limit * -1){
            balance -= withdraw;
            System.out.println(withdraw +"$ have been withdrawn");
        } else {
            System.out.println("not enough money");
        }
    }
}
