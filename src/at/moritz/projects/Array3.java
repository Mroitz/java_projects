package at.moritz.projects;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] number = {8, 3, 2, 22, 8, 1};


        Arrays.parallelSort(number, 0,6);
        for (int i : number) {
            System.out.print(i + " ");
        }
    }
}