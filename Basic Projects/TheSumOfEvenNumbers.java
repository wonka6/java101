package java101;

import java.util.Scanner;

public class TheSumOfEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isOdd = false;

        int sum = 0;
        while (!isOdd) {
            int number;
            System.out.print("Enter the number: ");
            number = input.nextInt();
            if (number % 2 == 0) {
                System.out.println("number: " + number);
                System.out.println("----");
                if (number % 4 == 0) {
                    sum += number;
                    System.out.println("sum : " + sum);
                }
            } else
                isOdd = true;
        }

        System.out.println("The sum of even numbers divisible by 4: " + sum);

    }
}

