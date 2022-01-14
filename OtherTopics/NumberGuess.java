package java101.OtherTopics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean IsWin = false;
        boolean IsWrong = false;

        Scanner input = new Scanner(System.in);

        while(right < 5){
            System.out.println("Please enter your guess: ");
            selected = input.nextInt();
            if(selected < 0 || selected > 99){
                System.out.println("Please enter numbers in 0-100.");
                if(!IsWrong){
                    IsWrong = true;
                    System.out.println("If you enter invalid number, right will be missing!");
                }else{
                    right++;
                    System.out.println("You enter a lot of invalid answer.Reserved rights: " + (5 - right));
                }
                continue;
            }
            if (selected == number){
                System.out.println("Congrats! Correct Guess. The secret number: " + number);
                IsWin = true;
                break;
            }else{
                System.out.println("Wrong Guess!");
                if(selected > number){
                    System.out.println(selected + " number is bigger than the secret number.");
                }else
                    System.out.println(selected + " number is smaller than the secret number.");

                wrong[right] = selected;
                right++;
                System.out.println("Reserved rights: " + (5 - right));
            }
        }

        if(!IsWin){
            System.out.println("======================================");
            System.out.println("You Lost!");
            if(!IsWrong){
                System.out.println("Your guesses: " + Arrays.toString(wrong));
            }
        }
    }
}
