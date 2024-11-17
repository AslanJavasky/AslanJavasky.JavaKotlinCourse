package mod10_design_pattern.lesson7_adapter.java;

public class Main {
    public static void main(String[] args) {

        Spell harry = new Wizard();
        harry.cast();

        Muggle dudley = new Muggle();
        MuggleAdapter adapter = new MuggleAdapter(dudley);
        adapter.cast();


    }
}
