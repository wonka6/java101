package java101;

import java.util.Scanner;

public class GCMAndLCM {
    public static void main(String[] args) {
        int n1, n2;
        int gcd = 1, lcm = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        n1 = input.nextInt();

        System.out.print("Enter 2nd number: ");
        n2 = input.nextInt();

        int temp1 = n1;
        int j = n1;
        int temp2 = n2;
        int i = n2;

        //GCD
        if (n1 > n2) {
            while (temp2 != 0) {
                if (n2 % i == 0 && n1 % i == 0) {
                    gcd = i;
                    break;
                }
                i--;
                temp2--;
            }
        }


        if (n1 < n2) {
            while (temp1 != 0) {
                if (n2 % j == 0 && n1 % j == 0) {
                    gcd = j;
                    break;
                }
                j--;
                temp1--;
            }
        }

        //LCM
        int k = 1;
        while (k != (n1 * n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                lcm = k;
            }
            k++;
        }

        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);

    }
}