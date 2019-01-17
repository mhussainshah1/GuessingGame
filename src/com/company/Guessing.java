package com.company;

import java.util.Scanner;

/**
 * I'm thinking of a number. Guess it. If you've ever played that game or some version of it you're ready for the next
 * assignment. The computer will "pick" a number. Actually, you'll program one in the code. You can use a random number
 *
 * Create a number-guessing game using a while-loop. The loop will allow users to guess until they get the number right.
 * Your program will keep looping as long as the guess is different from the secret number.
 * The output should look like this: (Secret number = 6)
 */

public class Guessing {
    public static void main(String[] args) {
        int r1 = 1 + (int)(Math.random() * 10);

        System.out.println("Secret number = " + r1);
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        Scanner keyboard = new Scanner(System.in);
        int guess;
        while(true){
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
            if(guess == r1){
                System.out.println("That's right! You're a good guesser.");
                break;
            } else {
                System.out.println("That is incorrect. Guess again.");
            }
        }
    }
}
