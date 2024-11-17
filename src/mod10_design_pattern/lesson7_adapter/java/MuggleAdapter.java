package mod10_design_pattern.lesson7_adapter.java;

public class MuggleAdapter implements Spell {

    private final Muggle muggle;

    public MuggleAdapter(Muggle muggle) {
        this.muggle = muggle;
    }

    @Override
    public void cast() {
        muggle.useMuggleSkills();
    }
}
