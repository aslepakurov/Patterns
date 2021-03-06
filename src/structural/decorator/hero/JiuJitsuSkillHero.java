package structural.decorator.hero;

/**
 * JiuJitsuSkillHero Class
 *
 * @author a.slepakurov
 * @version 8/14/2015
 */
public class JiuJitsuSkillHero extends ASkillfullHero {
    public JiuJitsuSkillHero(AbstractHero hero) {
        super(hero);
    }

    @Override
    public String whoAmI() {
        return super.whoAmI() + "I know Jiu-Jitsu.";
    }
}
