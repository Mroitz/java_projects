package at.moritz.projects;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {

        int[] randomNumber = new int [50];
        Random random = new Random();
        int sum = 0;
        int number = 0;

        for (int i = 0; i < randomNumber.length; i++) {
            number = random.nextInt(100);
            randomNumber[i] = number;
            sum += randomNumber[i];
            System.out.println(number);
        }

        System.out.println("Summe ist " + sum);
        
    }
}

