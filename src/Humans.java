import java.util.*;

public class Humans {
    Scanner scanner = new Scanner(System.in);

    String choice;
    String name;
    int health = 100;
    int strength = 5;
    int row = 8;
    int column = 1;
    int legendaries = 0;
    Map<Integer, String> items = new HashMap<>();
    List<String> inventory = new ArrayList<>();



    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public void humanMove(Humans human, Scanner scan, Lands land){
        String directionWarning="You can't go that way!";
        System.out.println("Which direction are you moving to?\n(Please enter 'n' for north, 's' for south, 'e' for east or 'w' for west.)");
        char direction = (scan.nextLine().charAt(0));
        land.map[getRow()][getColumn()]=" ~ ";
        switch (Character.toLowerCase(direction)){
            case 'n':
                if (!(human.getRow() <= 1)) {
                    setRow(getRow() - 1);
                }
                else System.out.println(directionWarning);
                break;
            case 's':
                if(!(human.getRow() >= 8)){
                    human.setRow(human.getRow()+1);
                }
                else System.out.println(directionWarning);
                break;
            case 'w':
                if(!(this.getColumn() <= 1)){
                    human.setColumn(human.getColumn()-1);
                }
                else System.out.println(directionWarning);
            case 'e':
                if(!(this.getColumn() >= 8)){
                    human.setColumn(human.getColumn()+1);
                }
                else System.out.println(directionWarning);
                break;
        }

    }



    public void startingWeapons(){
        items.put(-2, "0.) Hero's Curse");
        items.put(0, "1.) Hero's Fist");
        items.put(2, "2.) Heroic Rock");
    }

    public String getItem()
    {
        startingWeapons();
        Object[] itemsKeys = items.keySet().toArray();
        Object key = itemsKeys[new Random().nextInt(itemsKeys.length)];
        legendaries++;
        if(legendaries>=1) {
            items.put(6, "3.) Dagger");
            items.put(8, "4.) Sword");
            if (legendaries >= 2) {
                items.put(10, "5.) Greatsword");
                items.put(15, "6.) Cool Super Edgy Named Dagger");
                if (legendaries >= 3) {
                    items.put(18, "7.) Discount Master Sword But Re-skinned");
                    items.put(20, "8.) Even Bigger Greatsword");
                }

            }
        }
        return items.get(key);
    }

    public void getWeapon(Humans human){
        human.inventory.add(getItem());
        if(inventory.contains("0.) Hero's Curse"))
        {
            System.out.println("You feel the weight of the village crashing down on your will power!");
        }
        else
            System.out.println("You received "+String.join(" ", inventory));
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void chooseWeapon(Scanner scanner, Humans humans) {
        System.out.println("choose your weapon!\n(Enter number to left of weapon)");
        System.out.println(humans.inventory);
        String choice = scanner.nextLine();
        setChoice(choice);
        if (humans.inventory.contains(choice)) {
            switch (choice) {
                case "0":
                    setStrength(strength - 2);
                    break;
                case "1":
                    setStrength(strength);
                    break;
                case "2":
                    setStrength(strength + 2);
                    break;
                case "3":
                    setStrength(strength + 6);
                    break;
                case "4":
                    setStrength(strength + 8);
                    break;
                case "5":
                    setStrength(strength + 10);
                    break;
                case "6":
                    setStrength(strength + 15);
                    break;
                case "7":
                    setStrength(strength + 18);
                    break;
                case "8":
                    setStrength(strength + 20);
                    break;
            }
        } else System.out.println(choice + " is not in your inventory!");
    }
    public void removeWeapon(List<String> inventory){
        switch (getChoice()) {
            case "0":
                setStrength(strength + 2);
                inventory.remove(choice);
                break;
            case "1":
                setStrength(strength);
                inventory.remove(choice);
                break;
            case "2":
                setStrength(strength - 2);
                inventory.remove(choice);
                break;
            case "3":
                setStrength(strength - 6);
                inventory.remove(choice);
                break;
            case "4":
                setStrength(strength - 8);
                inventory.remove(choice);
                break;
            case "5":
                setStrength(strength - 10);
                inventory.remove(choice);
                break;
            case "6":
                setStrength(strength - 15);
                inventory.remove(choice);
                break;
            case "7":
                setStrength(strength - 18);
                inventory.remove(choice);
                break;
            case "8":
                setStrength(strength - 20);
                inventory.remove(choice);
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int attackGoblin(Goblins goblin) {
        goblin.health = goblin.health - this.strength;
        return goblin.health;
    }


    @Override
    public String toString() {
        return "Name:" + name +
                " HP:" + health +
                ", STR:" + strength +
                ", Inventory:" + String.join(" ", inventory);
    }

    public Humans() {

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
