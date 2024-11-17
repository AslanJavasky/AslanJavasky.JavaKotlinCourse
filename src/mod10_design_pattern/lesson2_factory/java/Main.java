package mod10_design_pattern.lesson2_factory.java;

public class Main {
    public static void main(String[] args) {

        MagicalCreature grakosha = MagicalCreatureFactory.createCreature("gragon");
        grakosha.makeSound();

        MagicalCreature griffin = MagicalCreatureFactory.createCreature("Griffin");
        griffin.makeSound();
    }
}
