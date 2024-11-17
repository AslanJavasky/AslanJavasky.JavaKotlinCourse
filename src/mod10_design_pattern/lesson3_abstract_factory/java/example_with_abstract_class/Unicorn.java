package mod10_design_pattern.lesson3_abstract_factory.java.example_with_abstract_class;

public class Unicorn extends AbstractMagicalCreature {
    @Override
    public void makeSound() {
        System.out.println("silence...");
    }

    @Override
    public String getDescription() {
        return "The unicorn is beautiful creature.";
    }
}
