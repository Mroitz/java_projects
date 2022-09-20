package at.moritz.projects;

import java.util.Scanner;

public class CäsarVerschlüsselung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text eingeben:");
        String text = scanner.nextLine();

        System.out.println("verschieben(1-128)");
        int offset = scanner.nextInt();

        if (offset >= 1 && offset <= 128) {

            char[] array = text.toCharArray();

            char[] array2 = verschlüsseln(offset, array);
            System.out.println("verschlüsselter text");

            for (int i = 0; i < array2.length; i++) {

                System.out.print(array2[i]);
            }
        }
    }


    public static char[] verschlüsseln(int offset, char[] charArray) {

        char[] cryptArray = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            int verschiebung = (charArray[i] + offset) % 128;
            cryptArray[i] = (char) (verschiebung);
        }
        return cryptArray;
    }
}
