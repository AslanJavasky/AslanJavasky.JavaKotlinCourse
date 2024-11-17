package mod10_design_pattern.lesson12_strategy.java;

public class Student {
    private String name;
    private StudyStrategy studyStrategy;

    public Student(String name, StudyStrategy studyStrategy) {
        this.name = name;
        this.studyStrategy = studyStrategy;
    }

    public void setStudyStrategy(StudyStrategy studyStrategy) {
        this.studyStrategy = studyStrategy;
    }

    public void learnSpell(String spell){
        System.out.println(name + " is learning:");
        studyStrategy.study(spell);
    }
}
