import java.util.Scanner;

public class areaCal {
    public static void main(String[] args) {
        int a, b, c;
        double area, p;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st edge:");
        a = input.nextInt();

        System.out.println("Enter 2nd edge:");
        b = input.nextInt();

        System.out.println("Enter 3rd edge:");
        c = input.nextInt();

        //the half of the perimeter
        p = (a + b+ c) / 2.0;

        //area of the triangle
        area = java.lang.Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("The area of  the triangle is: " + area);









    }
}
