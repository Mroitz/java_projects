package at.moritz.projects;

import java.util.Random;

public class Quersumme1 {
    public static void main(String[] args) {
        for (int number = 0; number < 1000; number++) {
            String NumberAsString = Integer.toString(number);
            char[] numbers = NumberAsString.toCharArray();
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }
            System.out.println(sum);
            //if (sum == 15) {
            //  System.out.println(numbers);
            //System.out.println(sum);
        }
    }
}
