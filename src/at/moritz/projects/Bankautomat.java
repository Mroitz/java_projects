package at.moritz.projects;

import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {

        System.out.println("Selektieren sie die gewünschte Funktion:" + "\n" + "1. Einzahlen" + "\n" + "2. Auszahlen" + "\n" + "3. Kontostand" + "\n" + "4. beenden"
        );
        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();

        boolean isFinished = false;
        int balance = 0;

        while (!isFinished){
        if (selection == 1){
            System.out.println("Geben sie den Betrag ein den Sie einzahlen möchten:");
            int einzahlen = scanner.nextInt();
            balance += einzahlen;
            System.out.println("Sie haben " + einzahlen + " Euro eingezahlt!");
        }

        System.out.println("Wählen sie zwischen Einzahlen(1) Auszahlen(2) Kontostand(3) beenden(4)");
        selection = scanner.nextInt();

        if (selection == 2){
            System.out.println("Geben sie den Betrag ein den Sie auszahlen möchten:");
            int auszahlen = scanner.nextInt();
            balance -= auszahlen;
            System.out.println("Sie haben " + auszahlen + " Euro ausgezahlt!");
        }

        if (selection == 3){
            System.out.println("Ihr Kontostand beträgt " + balance + " Euro!");
        }

        if (selection == 4){
            isFinished = true;
            System.out.println("Machine is stopping!");
        }

}
}
}