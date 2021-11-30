package java101.Methods;

import java.util.Scanner;

public class IsPalindrom {
    static boolean isPalindrom(int number) {
        int remain;
        int temp = number;
        int reverseNumber = 0;

        while (temp != 0) {
            remain = temp % 10;
            reverseNumber = reverseNumber * 10 + remain;
            temp /= 10;
        }
        return reverseNumber == number;
    }


    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();

        if (isPalindrom(number)) {
            System.out.println("The number of " + number + " is a Palindrom Number");
        } else
            System.out.println("The number of " + number + " is not a Palindrom Number");
    }
}