package java101;

import java.util.Scanner;

public class Suggestion {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter warmth: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Ski");
        } else if (heat <= 25) {
            if (heat <= 15) {
                System.out.println("Cinema");
            }
            if (heat >= 10) {
                System.out.println("Picnic");
            }
        } else {
            System.out.println("Swim");
        }

    }
}
