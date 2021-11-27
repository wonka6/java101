package java101;

import java.util.Scanner;

public class Horoscope {    //class
    public static void main(String[] args) {
        int month, day;
        String horoscope = " ";
        Scanner input = new Scanner(System.in);

        System.out.print("Birth Month: ");
        month = input.nextInt();

        System.out.print("Birth Day: ");
        day = input.nextInt();

        if (month == 1) {
            if (day < 23)
                horoscope = "Capricorn";
            else
                horoscope = "Aquarius";
        } else if (month == 2) {
            if (day < 21)
                horoscope = "Aquarius";
            else
                horoscope = "Pisces";
        } else if (month == 3) {
            if (day < 21)
                horoscope = "Pisces";
            else
                horoscope = "Aries";
        } else if (month == 4) {
            if (day < 21)
                horoscope = "Aries";
            else
                horoscope = "Taurus";
        } else if (month == 5) {
            if (day < 22)
                horoscope = "Taurus";
            else
                horoscope = "Gemini";
        } else if (month == 6) {
            if (day < 23)
                horoscope = "Gemini";
            else
                horoscope = "Yengec";
        } else if (month == 7) {
            if (day < 23)
                horoscope = "Cancer";
            else
                horoscope = "Leo";
        } else if (month == 8) {
            if (day < 23)
                horoscope = "Leo";
            else
                horoscope = "Virgo";
        } else if (month == 9) {
            if (day < 23)
                horoscope = "Virgo";
            else
                horoscope = "Libra";
        } else if (month == 10) {
            if (day < 23)
                horoscope = "Libra";
            else
                horoscope = "Scorpio";
        } else if (month == 11) {
            if (day < 22)
                horoscope = "Scorpio";
            else
                horoscope = "Sagittarius";
        } else if (month == 12) {
            if (day < 22)
                horoscope = "Sagittarius";
            else
                horoscope = "Capricorn";
        } else
            System.out.println("Invalid month");

        System.out.println("Your horoscope is : " + horoscope);
    }

}
