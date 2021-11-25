package java101;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double total = 0.0;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++){
            total += 1 / i;
        }

        System.out.println("Harmonic series of the number: " + total);
    }
}