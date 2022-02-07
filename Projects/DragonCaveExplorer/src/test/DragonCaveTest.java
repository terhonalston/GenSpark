import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragonCave;

    @BeforeEach
    void setUp() {
        dragonCave = new DragonCave();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void caveChoice() {
        assertAll("Choices",
                ()-> assertEquals("You approach the cave...\n" + "It is dark and spooky...\n"
                        + "A large dragon jumps in front of you! He opens his jaws and..."
                        + "gobbles you down in one bite!", dragonCave.caveChoice(1), "Choice 1 Isn't functioning"),
                ()->assertEquals("You approach the cave...\n" + "It is dark and spooky...\n" +
                        "Suddenly, you are blinded by very bright lights...its treasure!\n"
                        + "A dragon appears, but does not do anything.", dragonCave.caveChoice(2), "Cave choice 2 not functioning."),
                ()->assertEquals("The dragons sense you lack of direction and despise you. A dragon opens its mouth and flames cover" +
                        " you, but these flames do not burn you. \n" +  "They turn you into one of many of the treasure" +
                        " you sought. Maybe you should have just gone into one of the caves", dragonCave.caveChoice(3),
                        "Any choice that's not 1 or 2 isn't functioning"));

    }
}