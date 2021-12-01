package java101.Methods;

import java.util.Scanner;

public class AdvancedCalculator {
    static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.println("The result is: " + (number1 + number2));
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.println("The result is: " + (number1 - number2));
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.println("The result is: " + (number1 * number2));
    }

    static void division() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        if (number2 == 0)
            System.out.println("Undefined behaviour!");
        else
            System.out.println("The result is: " + (number1 / number2));
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element:");
        System.out.print("number : ");
        int number = input.nextInt();
        int result = 1;
        while (number != 0) {
            result *= number;
            number--;
        }
        System.out.println("The result is: " + result);
    }

    static void mode() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.println("The result is: " + (number1 % number2));
    }

    static void area() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements:");
        System.out.print("number 1: ");
        int number1 = input.nextInt();
        System.out.print("number 2: ");
        int number2 = input.nextInt();
        System.out.println("The calculation of rectangle area: " + (number1 * number2));
    }


    public static void main(String[] args) {
        int selection;
        int entry = 0;
        Scanner input = new Scanner(System.in);
        String menu = """
                Please enter the selection:
                1-Addition
                2-Subtraction
                3-Multiplication
                4-Division
                5-Factorial
                6-Mod
                7-Rectangle Area
                8-Log out""";


        while (entry != 8) {
            System.out.println(menu);
            selection = input.nextInt();
            
            switch (selection) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> division();
                case 5 -> factorial();
                case 6 -> mode();
                case 7 -> area();
                case 8 -> {
                    System.out.println("Bye!");
                    entry = 8;
                }
                default -> System.out.println("Please enter valid option!");
            }
        }
    }
}