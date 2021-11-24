package java101;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birthYear, left;
        String sign;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();

        left = birthYear % 12;

        switch (left) {
            case 0 -> sign = "Monkey";
            case 1 -> sign = "Rooster";
            case 2 -> sign = "Dog";
            case 3 -> sign = "Pig";
            case 4 -> sign = "Rat";
            case 5 -> sign = "Ox";
            case 6 -> sign = "Tiger";
            case 7 -> sign = "Rabbit";
            case 8 -> sign = "Dragon";
            case 9 -> sign = "Snake";
            case 10 -> sign = "Horse";
            case 11 -> sign = "Goat";
            default -> throw new IllegalStateException("Unexpected value: " + left);
        }

        System.out.println("Chinese Zodiac Sign: " + sign);

    }
}