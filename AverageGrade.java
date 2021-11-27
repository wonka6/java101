package java101;

import java.util.Scanner;

public class AverageGrade {    //class
    public static void main(String[] args) {
        int math, physic, turkish, chemistry, music, total = 0, i = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.printf("Math grade: ");
        math = input.nextInt();

        System.out.printf("Physic grade: ");
        physic = input.nextInt();

        System.out.printf("Turkish grade: ");
        turkish = input.nextInt();

        System.out.printf("Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.printf("Music grade: ");
        music = input.nextInt();

        if (0 < math && math < 100) {
            total += math;
            i++;
        }
        if (0 < physic && physic < 100) {
            total += physic;
            i++;
        }
        if (0 < turkish && turkish < 100) {
            total += turkish;
            i++;
        }
        if (0 < chemistry && chemistry < 100) {
            total += chemistry;
            i++;
        }
        if (0 < music && music < 100) {
            total += music;
            i++;
        }

        average = total / i;

        if (average <= 55) {
            System.out.println("Failed! See you next year!");
        } else {
            System.out.println("Passed! Congrats!");
        }

        System.out.println("Average is: " + average);
    }
}