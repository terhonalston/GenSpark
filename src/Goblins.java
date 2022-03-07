import java.util.Random;

public class Goblins {

    int health= getRandomHealth();
    int strength= getRandomStrength();
    String gName = getRandomGoblinName();
    int row = getRandomLocation();
    int column = getRandomLocation();


    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }


    public Goblins() {
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getRandomHealth(){
        return (int)Math.floor(Math.random()*(50-15)+15);
    }
    public int getRandomStrength(){
        return (int)Math.floor(Math.random()*(10-1+1)+1);
    }

    public int getRandomLocation(){
        return (int)Math.floor(Math.random()*(7-1)+1);
    }

    public String getRandomGoblinName(){
        String[] goblinNames={"Rombo", "Kimjaro", "Rex", "Lenchu", "Grubbo","Faruqu", "Bing-Bing", "Kimahri", "Ska'Burdo"
        , "Lippi", "Rox", "Rax", "Rux", "Rix", "Brother", "Sid"};
        Random randName = new Random();
        return goblinNames[randName.nextInt(goblinNames.length)];
    }

    @Override
    public String toString() {
        return "Name:" + gName +
                " The Goblin, HP:" + health +
                ", STR:" + strength;
    }
}
