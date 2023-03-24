package at.moritz.projects.BankAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount(1000);
        CheckingAccount c1 = new CheckingAccount(5000,1000);
        CreditAccount cr1 = new CreditAccount(0, 1000);

        s1.withdraw(400);

        c1.getBalance();
        c1.withdraw(2000);
    }
}
