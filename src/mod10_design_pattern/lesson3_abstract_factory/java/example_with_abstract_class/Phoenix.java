package mod10_design_pattern.lesson3_abstract_factory.java.example_with_abstract_class;

public class Phoenix extends AbstractMagicalCreature {

    @Override
    public void makeSound() {
        System.out.println("Kaaarrrr and cries.");
    }

    @Override
    public String getDescription() {
        return "Phoenix is a mythical bird that rise from the ashes.";
    }
}
