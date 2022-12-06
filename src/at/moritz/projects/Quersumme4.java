package at.moritz.projects;

import java.util.Scanner;

public class Quersumme4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number > 9){
            String NumberAsString = Integer.toString(number);
            char[] number2 = NumberAsString.toCharArray();
            int sum = 0;
            for (int i = 0; i < number2.length; i++) {
                sum += Character.getNumericValue(number2[i]);
            }
            number = sum;
            System.out.println(sum);
        }
    }
}

