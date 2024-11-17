package mod10_design_pattern.lesson10_flyweight.java;

public class Owl implements MagicalCreature {

    private String type;
    private String color;

    public Owl(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void display(String name, String owner) {
        System.out.println("Owl{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}');
    }
}
