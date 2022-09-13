package at.moritz.projects;

public class Array1 {
    public static void main(String[] args) {

        int[] data = {4,61,5,19,2,4,5,20,90,10};

        int data1 = 0;

        for (int i = 0; i < data.length; i++) {
            data1 += data[i];
        }
        System.out.println(data1);
    }
}
