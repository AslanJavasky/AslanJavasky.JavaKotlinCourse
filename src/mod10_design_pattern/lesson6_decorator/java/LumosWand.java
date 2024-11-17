package mod10_design_pattern.lesson6_decorator.java;

public class LumosWand extends WandDecorator {

    public LumosWand(Wand decoretedWand) {
        super(decoretedWand);
    }

    @Override
    public String castSpell() {
        return super.castSpell() + " " + "Lumos!";
    }
}
