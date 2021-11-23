package java101;

import java.util.Scanner;

public class NumberSortation {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers\na = ");
        a = input.nextInt();

        System.out.print("b = ");
        b = input.nextInt();

        System.out.print("c = ");
        c = input.nextInt();

        if ( a < b && a < c){
            if(b < c){
                System.out.println("Increasing order is: " + a + b + c);
            }else{
                System.out.println("Increasing order is: " + a + c + b);
            }
        }else if (c < b && c < a){
            if(a < b){
                System.out.println("Increasing order is: " + c + a + b);
            }else{
                System.out.println("Increasing order is: " + c + b + a);
            }
        }else if (b < c && b < a){
            if(a < c){
                System.out.println("Increasing order is: " + b + a + c);
            }else{
                System.out.println("Increasing order is: " + b + c + a);
            }
        }
    }
}