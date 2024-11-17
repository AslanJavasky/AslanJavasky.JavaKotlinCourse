package mod10_design_pattern.lesson12_strategy.java;

public class Main {
    public static void main(String[] args) {

        StudyStrategy bookStrategy = new BookStudyStrategy();
        Student hermione = new Student("Hermione Granger", bookStrategy);
        hermione.learnSpell("Vingardium Levioza");

        hermione.setStudyStrategy(new VideoStudyStrategy());
        hermione.learnSpell("Expelliarmus");

        Student harry = new Student("Harry Potter", new PracticalStudyStrategy());
        harry.learnSpell("Riktumsempra");


    }
}
