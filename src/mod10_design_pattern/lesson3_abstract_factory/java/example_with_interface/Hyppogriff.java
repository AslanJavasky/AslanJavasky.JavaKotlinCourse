package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

public class Hyppogriff implements MagicalBeast{

    @Override
    public void makeSound() {
        System.out.println("Rrrrr");
    }

    @Override
    public String getDescription() {
        return "The Hippogriff is a proud creature with the body of a horse and the head of an eagle.";
    }
}
