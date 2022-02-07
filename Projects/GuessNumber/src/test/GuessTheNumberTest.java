import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GuessTheNumberTest {
    GuessTheNumber tester;

    @BeforeEach
    void setUp() {
        tester = new GuessTheNumber();
    }

    @Test
    void main() {
        System.out.println(tester.main(""));

    }

    @Test
    void guessAndCheck() {
    }

    @AfterEach
    void tearDown() {
    }
}
