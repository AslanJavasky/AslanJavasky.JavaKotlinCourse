package mod10_design_pattern.lesson7_adapter.java;

public class Wizard implements Spell {
    @Override
    public void cast() {
        System.out.println("Expecto Patronum!");
    }
}
