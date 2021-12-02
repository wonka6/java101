package java101.Methods;

import java.util.Scanner;

public class PowerCal {
    static int power(int n1, int n2) {
        if (n1 == 0)
            return 1;
        else if (n1 == 1)
            return n2;
        else
            return n2 * power((n1 - 1), n2);

    }


    public static void main(String[] args) {
        System.out.print("base value: ");
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        System.out.print("pow value: ");
        int pow = input.nextInt();

        System.out.println("The result: " + power(pow, base));


    }
}