package mod10_design_pattern.lesson3_abstract_factory.java.example_with_interface;

public class Main {
    public static void main(String[] args) {

        MagicalBeast kluvokryl = new LegalCreationsFactory().createBeast();
        kluvokryl.makeSound();
        System.out.println(kluvokryl.getDescription());

        MagicalBeast enicorn = new IllegalCreationsFactory().createBeast();
        enicorn.makeSound();
        System.out.println(enicorn.getDescription());

    }
}
