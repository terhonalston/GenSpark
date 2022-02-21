import java.util.Random;

public class Goblins {
    int health=getRandomGoblinHealth();
    int strength=getRandomGoblinStrength();
    String gName = getRandomGoblinName();

    public Goblins() {
    }

    public int getRandomGoblinHealth(){
        return (int)Math.floor(Math.random()*(50-15)+15);
    }
    public int getRandomGoblinStrength(){
        return (int)Math.floor(Math.random()*(10-1+1)+1);
    }


    public String getRandomGoblinName(){
        String[] goblinNames={"Rombo", "Kimjaro", "Rex", "Lenchu", "Grubbo","Faruqu", "Bing-Bing", "Kimahri", "Ska'Burdo"
        , "Lippi", "Rox", "Rax", "Rux", "Rix", "Brother", "Sid"};
        Random randName = new Random();
        return goblinNames[randName.nextInt(goblinNames.length)];
    }

    @Override
    public String toString() {
        return "Goblins{" + "name=" + gName +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }
}
