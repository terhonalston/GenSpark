package genspark.Projects;
import java.util.Scanner;
public class DragonQuest {
    Scanner read = new Scanner(System.in);
    int choice = read.nextInt();

    public void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,"
                        + "you see two caves. In one cave, the dragon is friendly" +"and will share" +
                        "his treasure with you. The other dragon" +"is greedy and hungry and will eat you on sight." +
                "which cave will you go into? (1 or 2)");
      switch (choice){
          case 1:
              System.out.println("You approach the cave..." + "It is dark and spooky..."
              +"A large dragon jumps in front of you! He opens his jaws and..."
              +"Gobbles you down in one bite!");
              break;
          case 2:
              System.out.println("You approach the cave..." + "It is dark and spooky..." +
                      "Suddenly, you are blinded by very bright lights...its treasure!"
              +"a dragon appears, but does not do anything.");
              break;


      }

    }

}
