package TEST;

import java.util.Random;

public class EXAMPLE1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(0, 1000);

        Random random2 = new Random();
        int randomNumber2 = random.nextInt(randomNumber1);

        for (int i = randomNumber1; i > randomNumber2; i--) {
            System.out.println(i);
            if (randomNumber1 == randomNumber2) {
                System.out.println(randomNumber1);
            }
        }
    }
}