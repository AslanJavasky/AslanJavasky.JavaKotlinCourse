package mod10_design_pattern.lesson6_decorator.java;

public class BasicWand implements Wand {
    @Override
    public String castSpell() {
        return "Expecto patronum!";
    }
}
