package mod10_design_pattern.lesson12_strategy.java;

public class PracticalStudyStrategy implements StudyStrategy {

    @Override
    public void study(String spell) {
        System.out.println("Practicing the spell \"" + spell + "\" in the dueling club.");
    }
}
