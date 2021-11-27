import java.util.Scanner;

public class VatCalculate {
    public static void main(String[] args) {
        //Variable
        double money, vat;

        //define an object in Scanner class
        Scanner input = new Scanner(System.in);

        //take value from user
        System.out.print("Enter the principal amount: ");
        money = input.nextDouble();

        //if entered money is bigger than 1000 vat is %8, if is not vat is %18
        vat = (money > 1000) ? 0.8 : 0.18;

        //basic vat calculation
        money += money * vat;
		
		System.out.println("The principal amount is: " + money); 
		System.out.println("The vat value is: " + vat);
        System.out.print("The vat included amount: " + money);


    }
}
