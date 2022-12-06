package at.moritz.projects;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        int month = 0;
        int startday = 0;
        String[] days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};
        System.out.println("Fill in:");
        System.out.println("Startday 0-6:");
        Scanner scannerstartday = new Scanner(System.in);
        int numberstartday = scannerstartday.nextInt();
        System.out.println("Month 1-12:");
        Scanner scannermonth = new Scanner(System.in);
        int numbermonth = scannermonth.nextInt();
        int[] length = new int[31];
        int dayfor = numberstartday - 2 * numberstartday;

        switch (numbermonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                for (int i = 0; i < 31; i++) {
                    length[i] = i + 1;
                    ;
                }
                break;
            case 2, 4, 6, 9, 11:
                for (int i = 0; i < 30; i++) {
                    length[i] = i + 1;
                }

                break;

        }
        System.out.println("|" + days[0] + "|" + "|" + days[1] + "|" + "|" + days[2] + "|" + "|" + days[3] + "|" + "|" + days[4] + "|" + "|" + days[5] + "|" + "|" + days[6] + "|");
        for (int i = dayfor; i < length.length + numberstartday; i++) {

            if (i < 0) {
                {
                    System.out.print("|" + "00" + "|");
                }
            } else {
                if (i == 6 - numberstartday || i == 13 - numberstartday || i == 20 - numberstartday || i == 27 - numberstartday) {
                    if (i < 9) {
                        System.out.print("|" + "0" + length[i] + "| \n");
                    } else {
                        System.out.print("|" + length[i] + "| \n");
                    }
                } else {
                    if (i < 9) {
                        System.out.print("|" + "0" + length[i] + "|");
                    } else {
                        System.out.print("|" + length[i] + "|");
                    }
                }
            }
        }

    }
}

