import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(20) + 1;

        int counter = 1;
        boolean guessIncorrect = true;
        //getting the users name here.
        System.out.println("Hello! What is your name?");
        String name = read.next();
        //this is where we start the guessing loop
        System.out.println("Well " + name + " I'm thinking of a number between 1 and 20. \nTake a guess.");
        {
            while (guessIncorrect)
                for (; counter <= 6; counter++)//6 attempts or fewer
                {
                    try
                    {
                        int guess = read.nextInt();
                        System.out.println(guessAndCheck(guess, number, name, counter)); //Self-explanatory method
                        if (counter == 6 && guess!=number)//in case the user guesses correctly on the 6th attempt
                        {
                            System.out.println("You ran out of guesses!");
                            break;
                        }
                        else if (guess==number)
                        {
                            guessIncorrect = false;
                            System.out.println("Would you like to try again?(y or n)");
                            if (!read.next().equalsIgnoreCase("y"))
                            {
                                System.out.println("Play again soon!");
                                break;
                            }
                        }
                    }
                    catch (Exception e) {
                        System.out.println("Please enter a number between 1 and 20.");
                    }
                }
            }
        }



    //this method takes the user inputted guess and return whether it is too high, too low, or correct.
    public static String guessAndCheck(int guess, int number, String name, int counter) {
        if (guess > number) {
            return "Your guess is too high. \nTake a guess.";
        } else if (guess < number) {
            return "Your guess what too low. \nTake a guess.";
        } else {
            return "Good job, " + name + "! You guessed my number in " + counter + " guesses.";
        }
    }
}