package mod10_design_pattern.lesson13_observer.java;

public class Main {
    public static void main(String[] args) {

        Hogwarts hogwarts = new Hogwarts();
        hogwarts.registerObserver(new HarryPotter());
        hogwarts.setEvent("Exam is begin!");

        hogwarts.registerObserver(new HermioneGranger());
        hogwarts.notifyObservers();

    }
}
