package java101;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int numbers, element;
        int max = 0, min = 99999;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers: ");
        numbers = input.nextInt();


        for (int i = 1; i <= numbers; i++) {
            System.out.print("Enter " + i + ". element: ");
            element = input.nextInt();
            min = (min > element) ? element : min;

            max = (max < element) ? element : max;
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

    }
}