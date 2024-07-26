package mod2_oop.lesson20_generics;

public class Person<T extends Number> {

    private T id;
    private String name;
    private int age;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + getName() + ".");
    }


}
