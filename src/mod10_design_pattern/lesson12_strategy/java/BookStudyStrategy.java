package mod10_design_pattern.lesson12_strategy.java;

public class BookStudyStrategy implements StudyStrategy {

    @Override
    public void study(String spell) {
        System.out.println("Studying the spell \"" + spell + "\" using books.");
    }
}
