package mod10_design_pattern.lesson2_factory.java;

public class Griffin implements MagicalCreature{
    @Override
    public void makeSound() {
        System.out.println("Griffin's sound is :\"Rrrrrrr\"");
    }

    @Override
    public String description() {
        return "The griffin is a mythical creature with body of a lion and the head of an eagle.";
    }
}
