package at.moritz.projects;

public class Quersumme2 {
    public static void main(String[] args) {
        for (int number = 0; number < 1000; number++) {
            String NumberAsString = Integer.toString(number);
            char[] numbers = NumberAsString.toCharArray();

            if (number % 7 == 0){
                System.out.println(numbers);
            }
        }
    }
}