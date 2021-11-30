package java101;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int number, s1 = 0, s2 = 1, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        System.out.print(s1 + "\t" + s2 + "\t");

        for(int i = 2; i <= number; i++){
            sum = s1 + s2;
            System.out.print(sum + "\t");
            s1 = s2;
            s2 = sum;
        }
    }
}
