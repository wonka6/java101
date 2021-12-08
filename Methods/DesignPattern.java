package java101.Methods;

import java.util.Scanner;

public class DesignPattern {
    static void pattern(int number, boolean stat, int temp) {
        if (stat) {
            if (number > 0) {
                number -= 5;
                System.out.print(number + " \t");
            } else
                stat = false;
            pattern(number, stat, temp);
        } else {
            if (number != temp) {
                number += 5;
                System.out.print(number + " \t");
                pattern(number, false, temp);
            }
        }

    }


    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.print(number + "\t");
        pattern(number, true, number);
    }

}