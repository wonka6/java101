package java101;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        for (int i = number; i > 0; i--) {
            for (int k = (number - i); k > 0; k--)
                System.out.print(" ");
            for (int j = (2 * i - 1); j > 0; j--)
                System.out.print("*");

            System.out.println();
        }

    }
}
