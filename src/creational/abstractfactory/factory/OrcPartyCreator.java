package creational.abstractfactory.factory;

import creational.abstractfactory.character.Archer;
import creational.abstractfactory.character.Mage;
import creational.abstractfactory.character.Warrior;
import creational.abstractfactory.character.orc.OrcArcher;
import creational.abstractfactory.character.orc.OrcMage;
import creational.abstractfactory.character.orc.OrcWarrior;

/**
 * OrcPartyCreator Class
 *
 * @author a.slepakurov
 * @version 8/5/2015
 */
public class OrcPartyCreator implements IPartyCreator {
    private Mage mage;
    private Archer archer;
    private Warrior warrior;

    @Override
    public Mage createMage() {
        if (mage == null) {
            mage = new OrcMage();
        }
        return mage;
    }

    @Override
    public Archer createArcher() {
        if (archer == null) {
            archer = new OrcArcher();
        }
        return archer;
    }

    @Override
    public Warrior createWarrior() {
        if (warrior == null) {
            warrior = new OrcWarrior();
        }
        return warrior;
    }
}
