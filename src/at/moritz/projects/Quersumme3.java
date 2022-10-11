package at.moritz.projects;

public class Quersumme3 {
    public static int[] crosssums = new int[CrossSumCalculation(false) + 1];
    public static void main(String[] args) {
        CrossSumCalculation(true);
        int highestCrossSum1 = 0;
        int highestCrossSum2 = 0;
        int highestEmergence = 0;

        for (int i = 0; i < crosssums.length; i++){
            if (crosssums[i] == highestEmergence)
                highestCrossSum2 = i;
            if (crosssums[i] > highestEmergence) {
                highestCrossSum1 = i;
                highestEmergence = crosssums[i];
            }
        }

        System.out.println();
        if (highestCrossSum1 == highestCrossSum2 || highestCrossSum2 == 0)
            System.out.println("Highest Cross Sum: " + highestCrossSum1);
        else
            System.out.println("Highest Cross Sums: " + highestCrossSum1 + ", " + highestCrossSum2);
    }

    public static int CrossSumCalculation(boolean secondTry){
        int highestCrossSum = 0;
        for (int i = 0; i <= 1000; i++) {
            int crossSum = 0;
            int tmp = i;
            while (tmp > 0) {
                crossSum += tmp % 10;
                tmp /= 10;
            }
            if(crossSum > highestCrossSum) highestCrossSum = crossSum;
            if(secondTry) crosssums[crossSum]++;
        }
        return highestCrossSum;
    }
}