package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

//магические существа, которые находятся под учетом Министерства Магии
public class LegalCreationsFactory implements MagicalCreatureFactory{

    @Override
    public MagicalBird createBird() {
        return new Owl();
    }

    @Override
    public MagicalBeast createBeast() {
        return new Hyppogriff();
    }

}
