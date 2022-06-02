package TEST;

import java.util.Random;

public class EXAMPLE2 {
    public static void main(String[] args) {

        boolean isFinished = false;

        int Summe = 0;

        while (!isFinished){
            Random random = new Random();
            int randomNumber = random.nextInt(0, 10);
            Summe += randomNumber;
            if (randomNumber == 5){
                isFinished = true;
                System.out.println(Summe);
            }
        }
    }
}
