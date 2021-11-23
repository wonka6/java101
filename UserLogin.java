package java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newChoice, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.printf("Username: ");
        userName = input.nextLine();

        System.out.printf("Password: ");
        password = input.nextLine();

        if(userName.equals("patika") && (password.equals("java123"))){
            System.out.println("Signed in");
        } else {
            System.out.println("Wrong username or password.");
            System.out.println("Do you want to create new password:y or n");
            newChoice = input.nextLine();
            if ( newChoice.equals("y")){
                System.out.printf("New Password: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123")){
                    System.out.println("The new password should be different from the old password.");
                    System.out.println("New password could not be created.");
                }else {
                    System.out.println("New password created successfully.");
                }
            }

        }
    }
}