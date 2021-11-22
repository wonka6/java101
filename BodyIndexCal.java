import java.util.Scanner;

public class BodyIndexCal {
	public static void main(String[] args) {
		double Height, Weight, BodyMassIndex;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height: ");
		Height = input.nextDouble();
		
		System.out.println("Enter the weight: ");
		Weight = input.nextDouble();
		
		BodyMassIndex = Weight / (Height * Height);
		
		System.out.println("the body mass index is: " + BodyMassIndex);
		
	}
}