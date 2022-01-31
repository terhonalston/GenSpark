package genspark.Projects;

import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int number = 13;

        System.out.println("Hello, let's play a game! What is your name?");
        String name = read.nextLine();

        System.out.println("Well, " + name + ", I'm thinking of a number between 1 and 20. Can you guess it?");
        int guess = read.nextInt();

        for(int x = 6; x >= 0; x-- ){
            if(guess == number)
            {
                System.out.println("Good job, " + name + "! You guessed my number in" + x +" guesses!");
            }
            else if(guess < number)
            {
                System.out.println("Your guess was too low!");
            }
            else
            {
                System.out.println("Your guess was too high!");
            }
            System.out.println("Would you like to try again?");

        }

    }

}
