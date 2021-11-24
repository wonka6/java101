package java101;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, factN = 1, r, factR = 1, combination, factNR = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("First element: ");
        n = input.nextInt();
        System.out.print("Second element: ");
        r = input.nextInt();

        int n1 = n;
        int r1 = r;

        int dif = (n - r);

        while (n > 0) {
            factN *= n;
            n--;
        }

        while (r > 0) {
            factR *= r;
            r--;
        }

        while (dif > 0) {
            factNR *= dif;
            dif--;
        }
        combination = factN / (factR * factNR);

        System.out.println("the combination of (" + n1 + "," + r1 + ") : " + combination);

    }
}