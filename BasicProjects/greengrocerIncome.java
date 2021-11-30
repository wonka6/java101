package java101;

import java.util.Scanner;

public class greengrocerIncome {
	public static void main(String[] args) {
		
		double  Pear = 2.14, Apple = 3.67, Tomato = 1.11, Banana = 0.95, Eggplant = 5;
		double PearKg, AppleKg, TomatoKg, BananaKg, EggplantKg, Total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What kilos pear ? : ");
		PearKg = input.nextDouble();
		
		System.out.print("What kilos apple ? : ");
		AppleKg = input.nextDouble();
		
		System.out.print("What kilos tomato ? : ");
		TomatoKg = input.nextDouble();
		
		System.out.print("What kilos banana ? : ");
		BananaKg = input.nextDouble();
		
		System.out.print("What kilos eggplant ? : ");
		EggplantKg = input.nextDouble();

		Total = Pear * PearKg + Apple * AppleKg + Tomato * TomatoKg + Banana * BananaKg + Eggplant * EggplantKg;

		System.out.println("Total amount is : " + Total);

	}
}