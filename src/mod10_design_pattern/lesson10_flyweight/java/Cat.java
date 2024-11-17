package mod10_design_pattern.lesson10_flyweight.java;

public class Cat implements MagicalCreature{

    private String type;
    private String color;

    public Cat(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void display(String name, String owner) {
        System.out.println("Cat{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}');
    }
}
