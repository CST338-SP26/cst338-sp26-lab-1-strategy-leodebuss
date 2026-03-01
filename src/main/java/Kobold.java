/**
 * Name: Leonardo Lopez
 * Modified: 3/1/26
 */
public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}