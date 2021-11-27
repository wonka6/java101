package java101;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        String username, password;
        int request, balance = 1500, income, outcome, attempt = 3;

        Scanner input = new Scanner(System.in);

        while (attempt > 0) {
            System.out.print("Enter username: ");
            username = input.nextLine();

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (username.equals("wonka") && password.equals("123")) {
                System.out.println("Welcome to Willy Wonka Bank!");
                do {
                    System.out.println("Select the action: ");
                    System.out.print("1- Deposit money \n2-Withdraw money\n3-Balance inquiry\n4-Log out\n");
                    request = input.nextInt();

                    switch (request) {
                        case 1 -> {
                            System.out.print("Enter the amount you want to deposit: ");
                            income = input.nextInt();
                            balance += income;
                            System.out.println("Your deposit has been completed.");
                        }
                        case 2 -> {
                            System.out.print("Enter the amount you want to withdraw: ");
                            outcome = input.nextInt();
                            if (outcome > balance)
                                System.out.println("Insufficient balance!");
                            else {
                                balance -= outcome;
                                System.out.println("Your withdraw has been completed.");
                            }
                        }
                        case 3 -> System.out.println("Current Balance: " + balance);
                        case 4 -> System.out.println("See you soon!");
                        default -> System.out.println("Wrong selection.Try again!");
                    }
                } while (request != 4);
                break;

            } else {
                attempt--;
                if (attempt == 0) {
                    System.out.println("You've entered incorrectly 3 times in a row.");
                    System.out.println("Your card is blocked, please contact our bank.");
                } else {
                    System.out.println("Invalid username or password.Please try again.");
                    System.out.println("You have: " + attempt + " attempts");
                }
            }


        }
    }
}