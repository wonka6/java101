import java.util.Scanner;

public class circleAreaProject {
    public static void main(String[] args){
        double pi = 3.14, area, alpha;
        int r;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        r = input.nextInt();
		
		System.out.println("Enter the angles of the alpha: ");
        alpha = input.nextInt();

        area = (pi * (r * r) * alpha) / 360.0;

        System.out.println("the area is: " + area);
    }
}