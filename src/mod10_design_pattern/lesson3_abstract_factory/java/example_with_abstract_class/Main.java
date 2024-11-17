package mod10_design_pattern.lesson3_abstract_factory.java.example_with_abstract_class;

public class Main {
    public static void main(String[] args) {

        AbstractMagicalCreature kluvokryl = new LegalCreationsFactory().createBeast();
        kluvokryl.makeSound();
        System.out.println(kluvokryl.getDescription());

        AbstractMagicalCreature enicorn = new IllegalCreationsFactory().createBeast();
        enicorn.makeSound();
        System.out.println(enicorn.getDescription());

        AbstractMagicalCreature phoenix=new IllegalCreationsFactory().createBird();
        System.out.println(phoenix.getDescription());

    }
}
