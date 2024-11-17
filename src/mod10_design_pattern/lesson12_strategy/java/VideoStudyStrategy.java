package mod10_design_pattern.lesson12_strategy.java;

public class VideoStudyStrategy implements StudyStrategy{

    @Override
    public void study(String spell) {
        System.out.println("Watching a video tutorial on the spell \"" + spell + "\".");
    }
}
