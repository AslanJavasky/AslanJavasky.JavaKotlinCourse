package mod2_oop.lesson11_abstract;

public abstract class Person {

    protected String name;
    protected int age;

    public static final String KIND = "Human";

//    public static String getKIND(){
//        return KIND;
//    }

//    {
//        System.out.println("The new object of java class Person is created!");
//    }

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

    public Person() {}

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public abstract void sayHello();


}
