package java101;

import java.util.Scanner;

public class TheSumOfDigits {
    public static void main(String[] args) {
        int number;
        int value;
        int result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        int temp = number;

        while (temp != 0) {
            value = temp % 10; // each digit
            result += value; //the sum of the digits
            temp /= 10;
        }

        System.out.println("The sum of the each digit in " + number + ": " + result);
    }

}
