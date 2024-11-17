package mod10_design_pattern.lesson6_decorator.java;

public class FireWand extends WandDecorator {
    public FireWand(Wand decoretedWand) {
        super(decoretedWand);
    }

    @Override
    public String castSpell() {
        return super.castSpell() + " " + "Expelliarmus!";
    }
}
