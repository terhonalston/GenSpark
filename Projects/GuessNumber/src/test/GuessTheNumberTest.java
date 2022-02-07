import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber guessTheNumber;

    @BeforeEach
    void setUp() {
        guessTheNumber = new GuessTheNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void usersName() {
        String name = "TeRhon";
        assertEquals("Well " + name + " I'm thinking of a number between 1 and 20. \nTake a guess.", guessTheNumber.usersName(name), "The" +
                " method to get the users name isn't working");
    }

    @Test
    void guessAndCheck() {
        assertAll("Testing the method that takes users guess and checks to see if its correct.",
                ()-> assertEquals("Your guess is too high. \nTake a guess.", guessTheNumber.guessAndCheck(15,10,"TeRhon", 1),
                        "Method doesn't work when the guess is too high"),
                ()-> assertEquals("Your guess what too low. \nTake a guess.", guessTheNumber.guessAndCheck(5,10,"TeRhon",1),
                        "Method doesn't work when the guess is too low."),
                ()-> assertEquals("Good job, " + "TeRhon" + "! You guessed my number in " + 1 + " guesses.",
                        guessTheNumber.guessAndCheck(10,10,"TeRhon", 1)));
    }
}