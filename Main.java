import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int math, physics, chemistry, turkish, history, music;

        //define an object  in Scanner class
        Scanner input = new Scanner(System.in);

        //Take values from the user
        System.out.print("Enter  math exam grade: ");
        math = input.nextInt();

        System.out.print("Enter  physics exam grade: ");
        physics = input.nextInt();

        System.out.print("Enter  chemistry exam grade: ");
        chemistry = input.nextInt();

        System.out.print("Enter  turkish exam grade: ");
        turkish = input.nextInt();

        System.out.print("Enter  history exam grade: ");
        history = input.nextInt();

        System.out.print("Enter  music exam grade: ");
        music = input.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double result = total / 6.0;

        System.out.println("Average is : " + result);

        if (result <= 60.0) {
            System.out.println("Failed");
        }
        else {
            System.out.println("Passed");
        }

    }
}
