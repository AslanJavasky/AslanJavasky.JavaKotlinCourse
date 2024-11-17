package mod10_design_pattern.lesson2_factory.java;

public class Dragon implements MagicalCreature {
    @Override
    public void makeSound() {
        System.out.println("Dragon breathes fire...");
    }

    @Override
    public String description() {
        return "The dragon is a large creature that can breathe fire.";
    }
}
