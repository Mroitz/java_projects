package at.moritz.projects.BankAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(0);
        CheckingAccount c1 = new CheckingAccount(0,-1000);
        CreditAccount cr1 = new CreditAccount(0, -1000);

        cr1.deposit(0);
        cr1.withdraw(500);
        cr1.returnBalance();


    }
}
