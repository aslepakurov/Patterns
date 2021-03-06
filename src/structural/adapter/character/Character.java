package structural.adapter.character;

/**
 * Character Class
 *
 * @author a.slepakurov
 * @version 8/11/2015
 */
public class Character {
    private int health;

    public Character() {
        this(100);
    }

    protected Character(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return (health == 0) ? "Character is dead.\n" : "Character has " +
                health + " health.\n";
    }
}
