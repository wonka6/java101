package java101;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        int n, r;

        Scanner input = new Scanner(System.in);
        System.out.print("First element: ");
        n = input.nextInt();
        System.out.print("Second element: ");
        r = input.nextInt();

        int exponential = n;

        for (int i = 1; i < r; i++)
            exponential *= n;

        System.out.println("The exponential of (" + n + "," + r + "): " + exponential);
    }
}