package java101;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = input.nextInt();

        System.out.print("Enter second number: ");
        n2 = input.nextInt();

        System.out.println("Select type of operator: ");
        System.out.printf("1:Addition\n2:Subtraction\n3:Multiplication\n4:Divider\n");
        select = input.nextInt();

        switch (select) {
            case (1):
                System.out.println("Addition: " + (n1 + n2));
                break;
            case (2):
                System.out.println("Subtraction: " + (n1 - n2));
                break;
            case (3):
                System.out.println("Multiplication: " + (n1 * n2));
                break;
            case (4):
                switch (n2) {
                    case (0):
                        System.out.println("Undefined behaviour.");
                        break;
                }
                System.out.println("Division: " + (n1 / n2));
                break;
        }


    }
}