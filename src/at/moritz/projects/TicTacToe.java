package at.moritz.projects;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        String[][] feld = new String[3][3];

        boolean gamestop = false;

        while (gamestop == false)
        System.out.println("Player 1: Setze x mit 0-2");

        Scanner scannerrow = new Scanner(System.in);
        int player1row = scannerrow.nextInt();
        Scanner scannercol = new Scanner(System.in);
        int player1col = scannercol.nextInt();

        feld[player1row][player1col] = "x";

        for (int row = 0; row < feld.length; row++) {
            for (int column = 0; column < feld.length; column++) {
                System.out.print(feld[row][column] + "");
            }
            System.out.println("");
        }

        Scanner scannerrow2 = new Scanner(System.in);
        int player2row = scannerrow.nextInt();
        Scanner scannercol2 = new Scanner(System.in);
        int player2col = scannercol2.nextInt();

        feld[player1row][player1col] = "x";
        feld[player2row][player2col] = "o";


        for (int row = 0; row < feld.length; row++) {
            for (int column = 0; column < feld.length; column++) {
                System.out.print(feld[row][column] + "");
            }
            System.out.println("");
        }
    }
}
