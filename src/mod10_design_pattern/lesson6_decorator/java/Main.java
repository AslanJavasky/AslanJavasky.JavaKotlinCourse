package mod10_design_pattern.lesson6_decorator.java;

public class Main {
    public static void main(String[] args) {

        Wand basicWand = new BasicWand();
        Wand wandWithLumos= new LumosWand(basicWand);
        Wand wandWithFire= new FireWand(basicWand);

        System.out.println(basicWand.castSpell());
        System.out.println(wandWithLumos.castSpell());
        System.out.println(wandWithFire.castSpell());

    }
}
