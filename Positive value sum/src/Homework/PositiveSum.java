package Homework;

public class PositiveSum {
    public static void main(String[] args) {
        int [] daim = {12, -5, -14, 53, 5, -74};
        int sumOfPositive = 0;
        for (int i = 0; i < daim.length; i++) {
            if (daim[i] > 0) {
                sumOfPositive = sumOfPositive + daim[i];
            }
        }
        System.out.println(sumOfPositive);
    }
}

