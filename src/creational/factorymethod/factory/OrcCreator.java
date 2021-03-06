package creational.factorymethod.factory;

import creational.factorymethod.character.ACharacter;
import creational.factorymethod.character.Orc;

/**
 * OrcCreator Class
 *
 * @author a.slepakurov
 * @version 8/6/2015
 */
public class OrcCreator implements ICharacterCreator {

    @Override
    public ACharacter create(String nickname) {
        return new Orc(nickname);
    }
}
