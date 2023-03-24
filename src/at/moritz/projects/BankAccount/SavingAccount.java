package at.moritz.projects.BankAccount;

public class SavingAccount extends BaseAccount {
    public SavingAccount(int balance) {
        super(balance);
    }

    public void withdraw(int withdraw) {
        if (withdraw >= getBalance()) {
            System.out.println("not enough money");

        } else {
            getBalance() -= withdraw;
            System.out.println(withdraw + "$ have been withdrawn" );
        }

    }

}
