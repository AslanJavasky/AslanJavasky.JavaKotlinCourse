package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

public class Owl implements MagicalBird{
    @Override
    public void makeSound() {
        System.out.println("Uuuuu");
    }

    @Override
    public String getDescription() {
        return "The owl is wise creature that serves as a messanger.";
    }
}
