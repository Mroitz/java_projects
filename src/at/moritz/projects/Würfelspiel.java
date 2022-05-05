package at.moritz.projects;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        boolean isFinished = false;

        System.out.println("Um zu Würfeln drücken Sie die 1" +
                "\n" + "Um den Computer würfeln zu lassen drücken Sie die 2" +
                "\n" + "Drücken sie die 3, wenn Sie das Spiel beenden möchten");

        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();


        for (int i = 0; i <= 5; i++) {
            if (selection == 1) {
                Random random = new Random();
                int randomNumber2 = random.nextInt(1,6);
                randomNumber2 += sum1;
                if (i == 5) {
                    System.out.println(sum1);
                }
            }
        }

    }
}
