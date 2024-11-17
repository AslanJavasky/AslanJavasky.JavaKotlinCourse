package mod10_design_pattern.lesson10_flyweight.java;

public class Main {
    public static void main(String[] args) {

//        MagicalCreature byklya = new Owl("owl", "white");
//        MagicalCreature sychik = new Owl("owl", "white");

        //flyweight factory
        var factory = new CreatureFactory();

        MagicalCreature byklya = factory.getCreature("owl", "white");
        MagicalCreature sychik = factory.getCreature("owl", "white");

//        MagicalCreature zhivoglot = new Cat("cat", "ginger");
//        MagicalCreature cat2 = new Cat("cat", "ginger");

        MagicalCreature zhivoglot = factory.getCreature("cat", "ginger");
        MagicalCreature cat2 = factory.getCreature("cat", "ginger");

        System.out.println(byklya == sychik);
        System.out.println(zhivoglot == cat2);

        byklya.display("Hedwig","Harry Potter");
        sychik.display("Sichik","Ron Weasley");

        zhivoglot.display("Zhivoglot","Hermione Granger");
        cat2.display("McGonagall","No");
    }
}
