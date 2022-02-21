import java.util.*;

public class Lands {
    String[] enchantedForest = new String[16];
    Map<Integer, String> items = new HashMap<>();
    int legendaries = 0;



       {
        items.put(-2, "Hero's Curse");
        items.put(0, "Hero's Fist");
        items.put(2, "Heroic Rock");
        items.put(3, "Wooden Dagger");
        items.put(4, "Wooden Sword");
        items.put(5, "Wooden Greatsword");
        items.put(6, "Dagger");
        items.put(8, "Sword");
    }

    public String getItem()
    {
        Object[] itemsKeys = items.keySet().toArray();
        Object key = itemsKeys[new Random().nextInt(itemsKeys.length)];
        legendaries++;
        if(legendaries>=1)
        {
            items.put(10, "Greatsword");
            items.put(15, "Cool Super Edgy Named Dagger");
            if (legendaries>=2)
            {
                items.put(18, "Discount Master Sword But Re-skinned");
                items.put(20, "Even Bigger Greatsword");
            }

        }
        return items.get(key);

    }

    @Override
    public String toString() {
        return "Lands{" +
                "enchantedForest=" + Arrays.toString(enchantedForest) +
                '}';
    }
}
