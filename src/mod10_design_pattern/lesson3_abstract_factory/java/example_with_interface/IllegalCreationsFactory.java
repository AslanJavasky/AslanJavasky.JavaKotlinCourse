package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

//магические существа без учета в мире маглов
public class IllegalCreationsFactory implements MagicalCreatureFactory{
    @Override
    public MagicalBird createBird() {
        return new Phoenix();
    }

    @Override
    public MagicalBeast createBeast() {
        return new Unicorn();
    }
}
