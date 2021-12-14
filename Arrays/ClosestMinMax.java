package java101.Arrays;

import java.util.Scanner;
import java.lang.Math;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] arr = {56, 34, 1, 8, 101, -2, -33};
        int min = 999999;
        int max = 999999;
        int minVal = 0;
        int maxVal = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();


        for(int i : arr){
            if((number - i) > 0) {
                if (Math.abs(number - i) < min) {
                    min = Math.abs(number - i);
                    minVal = i;


                }
            }
            if((number - i) < 0) {
                if (Math.abs(number - i) < max) {
                    max = Math.abs(number - i);
                    maxVal = i;
                }
            }
        }

        System.out.println("Closest Min value : " + minVal);
        System.out.println("Closest Max value : " + maxVal);

    }
}

