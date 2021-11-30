package java101;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    counter += 1;
            }
            if (counter == 2) {
                System.out.print(i + "\t");
            }
        }
    }
}
