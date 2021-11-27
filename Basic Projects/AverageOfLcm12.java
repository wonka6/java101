package java101;

import java.util.Scanner;

public class AverageOfLcm12 {
    public static void main(String[] args) {
        int number, j = 0, sum = 0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                j++;
            }
        }

        average = sum / j;

        System.out.println("Average: " + average);
    }
}