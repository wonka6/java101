package java101.Methods;

import java.util.Scanner;

public class IsPrime {
    static int isPrime(int number, int i) {
        if (number == 2) {
            return 0;
        }
        while (number != i) {
            if (number % i != 0)
                return 0;
            else
                return 1;
        }
        return isPrime(number, (i + 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (isPrime(number, 2) == 0)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");


    }
}