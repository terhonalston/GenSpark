import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Humans {
    String name;
    int health=100;
    int strength=5;
    List<String >inventory = new ArrayList<>();
    Lands lands = new Lands();

    public void getWeapon(Humans human){
        human.inventory.add(lands.getItem());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    HashMap<String, Integer> weapons = new HashMap<>();

    public int attackGoblin(Goblins goblin)
    {
        goblin.health=goblin.health-this.strength;
        return goblin.health;
    }


    @Override
    public String toString() {
        return "Humans{" + "name=" + name +
                " health=" + health +
                ", strength=" + strength +
                ", inventory=" + inventory +
                '}';
    }

    public Humans(){

    }

    public Humans(int health, int strength) {
        this.health = health;
        this.strength = strength;
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
