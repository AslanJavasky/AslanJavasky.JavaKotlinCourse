package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

public class Phoenix implements MagicalBird{

    @Override
    public void makeSound() {
        System.out.println("Kaaarrrr and cries.");
    }

    @Override
    public String getDescription() {
        return "Phoenix is a mythical bird that rise from the ashes.";
    }
}
