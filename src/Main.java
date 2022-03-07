import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Humans human = new Humans();
        Goblins goblins = new Goblins();
        Lands lands = new Lands();


        System.out.println("Something, something, Princess. Something, something, farm boy." +
                "\n\nAhh here we are. Well you ran out into the forest...for some reason. There were" +
                " plenty of more capable people to rescue her but here we are..\nSeriously you'd have" +
                " to be pretty lucky to even last 5 minutes out there! I've seen goblins decimate admirable captains!\n");
        System.out.println("....anyway....what's your name 'hero'?");

        human.setName(scan.nextLine());
        System.out.println("Well " + human.name + " good luck. Maybe that tall fellow will be better at tending to the crops." +
                "\nNow what was his name again?.....");
        lands.createMap();

        lands.printMap();
        while (true) {
            int turn=0;
            human.humanMove(human, scan, lands);
            lands.printMap();
            if(turn==100)
                break;
        }

    lands.printMap();

    human.getWeapon(human);
        System.out.println(human);
    human.chooseWeapon(scan, human);
    human.removeWeapon(human.inventory);
    System.out.println(human);

    lands.printMap();
        System.out.println(human);
        System.out.println(goblins);
        battleMode(goblins,human, lands);
    }

    public static void battleMode(Goblins goblin, Humans human, Lands land){
        int humanHP;
        int goblinHP;
        int humanAttack;
        int goblinAttack;

        while(goblin.health>0&&human.health>0){
            humanHP = human.getHealth();
            goblinHP = goblin.getHealth();
            humanAttack = (int) (human.strength-5 + (Math.random()*(human.strength)+5));
            goblinAttack = (int) (goblin.strength-5 + (Math.random()*(goblin.strength)+5));

        goblin.setHealth(goblin.getHealth()-humanAttack);
        System.out.println(human.name+" attacked for "+ (goblinHP-goblin.health)+" damage!\n"+goblin);
        if(goblin.getHealth()<=0) {
            System.out.println(goblin.gName+" has been slain!");
            break;
        }
        human.setHealth(human.getHealth()-goblinAttack);
        System.out.println(goblin.gName+" attacked for "+ (humanHP-human.health)+" damage!\n"+human);
        if(human.getHealth()<=0) {
            System.out.println("You have been slain. Poor kid never had a chance...");
            break;
        }
        }
        human.getWeapon(human);
    }
}
