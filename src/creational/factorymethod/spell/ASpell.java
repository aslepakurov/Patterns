package creational.factorymethod.spell;

import creational.factorymethod.character.ACharacter;

/**
 * Spell Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class ASpell {
    private String name;
    private SpellType type;
    private ACharacter character;

    protected ASpell(String name, SpellType type, ACharacter character) {
        this.name = name;
        this.type = type;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpellType getType() {
        return type;
    }

    public void setType(SpellType type) {
        this.type = type;
    }

    public ACharacter getCharacter() {
        return character;
    }

    public void setCharacter(ACharacter character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return String.format("%s casted the %s  spell from %s dimension.\n", character.toString(), ((name.equals("") || name.equals("name")) ? "unknown" : "\'" + name + "\'"), type.getName());
    }
}
