package mod10_design_pattern.lesson13_observer.java;

public class HermioneGranger implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Hermione Granger found out about:" + event);
    }
}
