/**
 *
 */
import java.util.*;

public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items = new HashMap<String, Integer>();

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Monster monster = (Monster) object;
        return java.util.Objects.equals(hp, monster.hp) && java.util.Objects.equals(xp, monster.xp) && java.util.Objects.equals(maxHP, monster.maxHP) && java.util.Objects.equals(items, monster.items);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), hp, xp, maxHP, items);
    }

    @Override
    public String toString() {
        return "Monster has : hp=" + hp + "/" + maxHP;
    }
}