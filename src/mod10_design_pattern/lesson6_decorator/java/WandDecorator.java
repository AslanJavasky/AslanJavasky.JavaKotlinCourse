package mod10_design_pattern.lesson6_decorator.java;

public abstract class WandDecorator implements Wand {

    protected Wand decoretedWand;

    public WandDecorator(Wand decoretedWand) {
        this.decoretedWand = decoretedWand;
    }

    @Override
    public String castSpell() {
        return decoretedWand.castSpell();
    }
}
