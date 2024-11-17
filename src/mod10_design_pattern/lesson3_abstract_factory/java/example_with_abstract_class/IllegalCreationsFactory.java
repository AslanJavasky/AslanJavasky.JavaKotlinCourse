package mod10_design_pattern.lesson3_abstract_factory.java.example_with_abstract_class;

//магические существа без учета в мире маглов
public class IllegalCreationsFactory implements MagicalCreatureFactory {
    @Override
    public AbstractMagicalCreature createBird() {
        return new Phoenix();
    }

    @Override
    public AbstractMagicalCreature createBeast() {
        return new Unicorn();
    }
}
