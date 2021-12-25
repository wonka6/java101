package java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] Sortation(int[] list) {
        int temp = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = (i + 1); j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public static int[] EnteredArray() {
        int dim;
        System.out.print("Enter the dimension: ");
        Scanner input = new Scanner(System.in);
        dim = input.nextInt();

        int[] list = new int[dim];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < dim; i++) {
            System.out.print((i + 1) + ". element: ");
            list[i] = input.nextInt();
        }


        return list;

    }

    public static void main(String[] args) {

        int[] list = EnteredArray();
        System.out.println("-------------------");
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(list));
        System.out.println("-------------------");
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(Sortation(list)));
    }


}
