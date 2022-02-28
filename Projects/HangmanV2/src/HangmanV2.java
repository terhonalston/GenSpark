import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HangmanV2 {
    public static void main(String[] args) {
        // write your code here
        HashMap<String, Integer> score = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        intro();
        String name = takeName(scanner);
        String word = createWord();
        System.out.println(word);
        List<Character> guesses = new ArrayList<>();
        boolean guessedWord = false;
        int incorrectGuesses = 0;



        while (!guessedWord) {
            char guess = scanner.nextLine().charAt(0);
            try {
                takeGuess(guesses, guess);
            } catch (InputMismatchException ime) {
                System.out.println("I'll assume that to be a joke. You have to say a letter to guess the word!");
            }
            if (!checkGuess(guess, word)) {
                incorrectGuesses++;
                if (incorrectGuesses >= 6) {
                    System.out.println("You lose!");
                    break;
                }
            }
            String status = gameStatus(word, guesses);
            System.out.println(gameStatus(word, guesses));
            if (!status.contains("_")) {
                System.out.println("You win!");
                guessedWord = true;
            }
        }
    }

    public static String createWord() {
        Random ranWord = new Random();
        List<String> dictionary;
        String word = null;
        try (Stream<String> lines = Files.lines(Path.of("C:\\Users\\Daphne\\IdeaProjects\\Tools\\usa.txt"))) {
            dictionary = lines.collect(Collectors.toList());
            word = dictionary.get(ranWord.nextInt(dictionary.size()));
        } catch (IOException ioe) {
            System.out.println("File not found, please update directory!");
        }
        return word;
    }

    public static void intro() {
        System.out.println("The year is 1776, and you are a curious person who aspires to be an inventor!" +
                "\nHowever, you have no education and can barely read. You decide to steal a book. You steal " +
                "more and more until one day you get caught in the act!" +
                "\n\n\"I shall give you one and only one chance to prove you me that your thievery was not in vain!\"" +
                " says the king. \n\"You have 6 attempts to guess the letters in the word I'm thinking of. If you fail, so will your lungs!\"");
    }

    public static String takeName(Scanner scanner){
        System.out.println("\n\"Before we begin, I require the name of the thief who will be punished. Speak your name!\"");
        String name = scanner.nextLine();

        System.out.println("\"Well "+name+", let's begin. Guess your first letter.\"");
                return name;
    }

    //just checks to see if user inputs a letter then adds to list of guess if letter wasn't attempted before.
    public static void takeGuess(List<Character> guesses, Character guess) {
        if (Character.isLetter(guess)) {
            if (guesses.contains(guess)) {
                System.out.println("You've already guessed " + guess + "!");
            } else {
                guesses.add(guess);
            }
        } else System.out.println("Please enter a letter!");
    }

    public static boolean checkGuess(Character guess, String word) {
        return word.contains(Character.toString(guess));
    }

    //places either the guessed letter or '_' relative to the word
    public static String gameStatus(String word, List<Character> guesses) {
        return word.chars()
                .map(w -> guesses.contains((char) w) ? (char) w : '_')
                .mapToObj(w -> Character.toString((char) w))
                .collect(Collectors.joining());
    }
}
