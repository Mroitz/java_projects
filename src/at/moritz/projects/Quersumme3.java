package at.moritz.projects;

public class Quersumme3 {
    public static void main(String[] args) {
        int stelle = 0;
        int anzahl = 1;

        for (int number = 0; number < 1000; number++) {
            String NumberAsString = Integer.toString(number);
            char[] numbers = NumberAsString.toCharArray();
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Character.getNumericValue(numbers[i]);
            }
            //System.out.println(sum);
            String sumAsString = Integer.toString(sum);
            System.out.println(sumAsString);
        }
        for (int i = 0; i < sumAsString.lenght; i++) {

        }


        for (int i = 0; i < sum.length - 1; ++i) {

            if (sum[i] == sum[i + 1]) {
                ++anzahl;
            }

        }
        if (arr[i] != arr[i + 1]) {
            anzahl = 1;

        }

    }
}