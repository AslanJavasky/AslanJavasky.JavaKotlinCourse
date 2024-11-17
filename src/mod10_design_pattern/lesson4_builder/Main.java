package mod10_design_pattern.lesson4_builder;

public class Main {
    public static void main(String[] args) {

        MagicalCreature huppogriff = MagicalCreature.builder()
                .setName("Klyvokryl")
                .setAge(5)
                .setHabitat("Forest and open fields")
                .setType("Hippogriff")
                .build();

        MagicalCreature phoenix = MagicalCreature.builder()
                .setName("Fawkes")
                .setType("Phoenix bird")
                .setAge(Integer.MAX_VALUE)
                .setHabitat("Albus Dumldore's office")
                .build();

        System.out.println(huppogriff);
        System.out.println(phoenix);
    }
}
