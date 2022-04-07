package at.moritz.projects;

import java.util.Random;

public class While1 {
    public static void main(String[] args) {

        boolean isStop = false;
        int sum = 0;
        Random random = new Random();
        int randomNumber = 0;
        while (!isStop){
            randomNumber = random.nextInt(10,30);
            if (randomNumber == 15 || randomNumber == 25){
                isStop = true;
            }
            else {
                sum += randomNumber;
            }

        };

        System.out.println(sum);

    }
}
