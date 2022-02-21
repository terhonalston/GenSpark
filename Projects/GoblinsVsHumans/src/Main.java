import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	// write your code here
    Humans human = new Humans();
    Goblins goblins = new Goblins();
    Lands lands = new Lands();

    System.out.println("Something, something, Princess. Something, something, farm boy." +
            "\nAhh here we are. Well you ran out into this forest for some reason. There were" +
            " plenty of more capable people to rescue her but here we are..\nSeriously you'll have" +
            " to be pretty lucky to even last 5 minutes out there! I've seen goblins decimate admirable captains!");
    System.out.println("....anyway....what's your name 'hero'?");
    Scanner scan = new Scanner(System.in);
    human.name=scan.nextLine();
    System.out.println("Well "+human.name+" good luck. Maybe that tall fellow will be better at tending to the crops." +
            "\nNow what was his name again?.....");



    human.attackGoblin(goblins);
    System.out.println(goblins);
    System.out.println(human);
    human.getWeapon(human);
    //System.out.println(lands.getItem().toString());
        System.out.println(human);
        System.out.println(goblins);
    }
}
