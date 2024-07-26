package mod2_oop.lesson11_abstract;

import mod2_oop.lesson11_abstract.Person;
import mod2_oop.lesson11_abstract.TeacherKt;

public class Teacher extends Person {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, String subject) {
        this(name, age);
        this.subject = subject;
    }


    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + super.name + ". I'm a teacher.");
    }

    public static Teacher getInstance() {
        return new Teacher();
    }

    public static Teacher getInstance(String name) {
        return new Teacher(name);
    }

    public static Teacher getInstance(String name, int age) {
        return new Teacher(name, age);
    }

    public static Teacher getInstance(Person other) {
        return new Teacher(other.getName(), other.getAge());
    }

}
