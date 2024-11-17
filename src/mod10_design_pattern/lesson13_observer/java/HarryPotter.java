package mod10_design_pattern.lesson13_observer.java;

public class HarryPotter implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Harry Potter found out about:" + event);
    }
}
