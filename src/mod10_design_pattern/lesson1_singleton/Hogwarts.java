package mod10_design_pattern.lesson1_singleton;

public class Hogwarts {

    private static Hogwarts instance;

    private Hogwarts() {
    }

    public void enrollStudent(String name){
        System.out.println("Student "+name+" enrolled in Hogwarts!");
    }

    public static Hogwarts getInstance() {
        if (instance == null) {
            instance = new Hogwarts();
        }
        return instance;
    }
}
