package java101;

import java.util.Scanner;

public class FlightTicket {    //class
    public static void main(String[] args) {
        int km, type, age;
        double perKm = 0.10, standardAmount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter the kilometer: ");
        km = input.nextInt();

        System.out.print("Enter the type of flight ticket(0 => One-way, 1 => Return): ");
        type = input.nextInt();

        if (km > 0) {
            if (age < 12) {
                if (type == 0) {
                    standardAmount = perKm * km;
                } else if (type == 1) {
                    standardAmount = (perKm * km * 2);
                    standardAmount -= standardAmount * 0.20;
                } else
                    System.out.println("Invalid data entered.");

                standardAmount -= standardAmount * 0.50;
            } else if (age >= 12 && age <= 24) {
                if (type == 0) {
                    standardAmount = perKm * km;
                } else if (type == 1) {
                    standardAmount = (perKm * km * 2);
                    standardAmount -= standardAmount * 0.20;
                } else
                    System.out.println("Invalid data entered.");


                standardAmount -= standardAmount * 0.10;
            } else if (age > 65) {
                if (type == 0) {
                    standardAmount = perKm * km;
                } else if (type == 1) {
                    standardAmount = (perKm * km * 2);
                    standardAmount -= standardAmount * 0.20;
                } else {
                    System.out.println("Invalid data entered.");
                }

                standardAmount -= standardAmount * 0.30;
            } else {
                if (type == 0) {
                    standardAmount = perKm * km;
                } else if (type == 1) {
                    standardAmount = (perKm * km * 2);
                    standardAmount -= standardAmount * 0.20;
                } else {
                    System.out.println("Invalid data entered.");
                }
            }


            if (standardAmount != 0)
                System.out.println("Total amount: " + standardAmount + " TL");

        } else {
            System.out.println("Invalid data entered.");
        }


    }

}