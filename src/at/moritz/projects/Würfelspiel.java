package at.moritz.projects;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        boolean isFinished = false;

        System.out.println("\n" + "Throw the dice!" + "\n" +
                "\n" + "If you want to throw press 1!" +
                "\n" + "If the Computer should threw press 2!" +
                "\n" + "If you want to end the game press 3!");

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        while (!isFinished) {
            if (selection == 1) {
                for (int i = 0; i <= 4; i++) {
                    Random random = new Random();
                    int randomNumber2 = random.nextInt(1, 7);
                    sum1 += randomNumber2;
                    if (i == 4) {
                        System.out.println("You threw " + sum1 + "!");
                    }
                }
                selection = scanner.nextInt();
            }
            if (selection == 2) {
                for (int i = 0; i <= 4; i++) {
                    Random random = new Random();
                    int randomNumber3 = random.nextInt(1, 7);
                    sum2 += randomNumber3;
                    if (i == 4) {
                        System.out.println("The Computer threw " + sum2 + "!");
                    }
                }
            }

            if (sum2 > sum1) {
                System.out.println("\n" + "The Computer Won!" + "\n" +
                        "\n" + "If you want to throw press 1!" +
                        "\n" + "If the Computer should threw press 2!" +
                        "\n" + "If you want to end the game press 3!");
            }

            if (sum1 > sum2) {
                System.out.println("\n" + "You won!" + "\n" +
                        "\n" + "If you want to throw press 1!" +
                        "\n" + "If the Computer should threw press 2!" +
                        "\n" + "If you want to end the game press 3!");
            }
            selection = scanner.nextInt();

            if (selection == 3) {
                isFinished = true;
                System.out.println("The game was stopped!");
            }
        }
    }

}