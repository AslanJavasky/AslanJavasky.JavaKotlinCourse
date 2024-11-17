package mod10_design_pattern.lesson3_abstract_factory.java.example_with_abstract_class;

//магические существа, которые находятся под учетом Министерства Магии
public class LegalCreationsFactory implements MagicalCreatureFactory {

    @Override
    public AbstractMagicalCreature createBird() {
        return new Owl();
    }

    @Override
    public AbstractMagicalCreature createBeast() {
        return new Hyppogriff();
    }

}
