
import java.util.Scanner;

public class DragonCave {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        //introduction
        System.out.println("You are in a land full of dragons. \nIn front of you,"
                + " you see two caves. \nIn one cave, the dragon is friendly" + " and will share" +
                " his treasure with you. \nThe other dragon" + " is greedy and hungry and will eat you on sight." +
                "\nWhich cave will you go into? (1 or 2)");
        try {
            int choice = read.nextInt();
            System.out.println(caveChoice(choice));
        } catch (Exception e) {
            System.out.println("Please enter a number.");
        }

    }

    public static String caveChoice(int choice) {
        if (choice == 1) {
            return "You approach the cave...\n" + "It is dark and spooky...\n"
                    + "A large dragon jumps in front of you! He opens his jaws and..."
                    + "gobbles you down in one bite!";
        } else if (choice == 2) {
            return "You approach the cave...\n" + "It is dark and spooky...\n" +
                    "Suddenly, you are blinded by very bright lights...its treasure!\n"
                    + "A dragon appears, but does not do anything.";
        } else {
            return "The dragons sense you lack of direction and despise you. A dragon opens its mouth and flames cover you, but these flames do not burn you. \n" +
                     "They turn you into one of many of the treasure you sought. Maybe you should have just gone into one of the caves";
        }
    }
}




