import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class HangmanTest {

    Hangman hangman;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        hangman = new Hangman();
        ArrayList guesses = new ArrayList<>();
        }

    @AfterEach
    void tearDown() {
    }

    @Test
    void takeGuess() {
        //assertTrue(Hangman.takeGuess());
    }
}