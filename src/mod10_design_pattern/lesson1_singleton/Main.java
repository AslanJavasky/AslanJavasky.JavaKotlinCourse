package mod10_design_pattern.lesson1_singleton;

public class Main {
    public static void main(String[] args) {

//        Hogwarts school=new Hogwarts();
        Hogwarts school = Hogwarts.getInstance();
        school.enrollStudent("Harry Potter");


        Hogwarts anotherReference= Hogwarts.getInstance();
        if (school == anotherReference){
            System.out.println("There is only one instance of Hogwarts class!");
        }

//        HogwartsK insK=new HogwartsK();
        HogwartsK insK=HogwartsK.getInstance();
        insK.enrollStudent("Hermione Granger");

        HogwartsK insK2=HogwartsK.getInstance();
        insK.enrollStudent("Hermione Granger");
        System.out.println(insK==insK2);
    }
}
