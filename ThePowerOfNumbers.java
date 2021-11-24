package java101;

import java.util.Scanner;

public class ThePowerOfNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("enter the number: ");
        number = input.nextInt();

        System.out.println("the power of 4:");
        for (int i = 1; i <= number; i *= 4)
            System.out.print(i + " ");

        System.out.println("\nthe power of 5:");
        for (int i = 1; i <= number; i *= 5)
            System.out.print(i + " ");
    }
}