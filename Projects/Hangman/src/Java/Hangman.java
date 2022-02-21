import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        // write your code here
        List<String> dictionary = new ArrayList<>();
        String word=null;
        Random ranWord;

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Daphne\\IdeaProjects\\Tools\\usa.txt"));
            while (scanner.hasNext()) {
                dictionary.add(scanner.nextLine());
                ranWord = new Random();
                word = dictionary.get(ranWord.nextInt(dictionary.size()));
            }
        }
        catch (FileNotFoundException fnf) {
            System.out.println("File not found, please update directory!");
        }

        Scanner userScan = new Scanner(System.in);
        List<Character> guesses = new ArrayList<>();

        System.out.println("The year is 1776, and you are a curious person who aspires to be an inventor!" +
                "\nHowever, you have no education and can barely read. You decide to steal a book. You steal " +
                "more and more until one day you get caught in the act!" +
                "\n'I shall give you one and only one chance to prove you me that your thievery was not in vain!'" +
                " says the king.\n'You have 6 attempts to guess the letters in the word I'm thinking of. If you fail, so will your lungs!'");

        int incorrectGuesses=0;
        while (word != null) {
            String guess = userScan.nextLine();
            hangedMan(incorrectGuesses);
            gameStatus(word,guesses);
            if(incorrectGuesses==6) {
                System.out.println("May your poor soul rest in peace...");
                break;
            }
            try {
                if(!takeGuess(guesses, guess, word)) {
                    incorrectGuesses++;
                }
            }
            catch (Exception e1) {
                System.out.println("Error, please enter a letter to proceed.");
            }

            if (gameStatus(word, guesses))
                    break;

            //gameStatus(word, guesses);
        }
    }
    public static boolean takeGuess(List<Character> guesses, String guess, String word){
        System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("\nTake a guess!");
        System.out.println();

        if(guess.length()>1|| Character.isDigit(guess.charAt(0))) {
            System.out.println("Please enter a letter!");
        }
        else if (guesses.contains(guess)) {
            System.out.println("You've already guessed this letter!");
        }
        else {
            guesses.add(guess.charAt(0));
        }
        return word.contains(guess);
    }

    public static boolean gameStatus(String word, List<Character> guesses) {
        int correctLetter = 0;
        for (int i = 0; i < word.length(); i++) {

            if (guesses.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctLetter++;

                if(correctLetter==word.length()) {
                    System.out.println("\n\nCongratulations, you've survived this game!");
                }
            }
            else {
                System.out.print("_");
            }
        }
        System.out.println("\n\n");
        return (word.length()==correctLetter);
    }

    public static void hangedMan(int incorrectGuesses) {
        System.out.println("    |---------|");
        System.out.println("    |         |");

        if(incorrectGuesses>=1) {
            System.out.println("    O         |");
        }

        if(incorrectGuesses>=2) {
            System.out.print("   /");
            if(incorrectGuesses>=3) {
                System.out.print("|");
                if(incorrectGuesses>=4) {
                    System.out.println("\\        |");
                }
            }
        }

        if(incorrectGuesses>=5) {
            System.out.print("   /");
            if(incorrectGuesses>=6) {
                System.out.print(" \\        |");
            }
        }
        System.out.println("\n\n");
    }
}
