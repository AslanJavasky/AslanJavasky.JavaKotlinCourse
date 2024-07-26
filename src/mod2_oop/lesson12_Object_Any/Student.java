package mod2_oop.lesson12_Object_Any;

import mod2_oop.lesson12_Object_Any.Person;

import java.util.Objects;

//is -a
public class Student extends Person {

    private int course;


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int course) {
        this(name, age);
        this.course = course;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + ". I'm a student.");
    }

    public static Student getInstance() {
        return new Student();
    }

    public static Student getInstance(String name) {
        return new Student(name);
    }

    public static Student getInstance(String name, int age) {
        return new Student(name, age);
    }

    public static Student getInstance(String name, int age, int course) {
        return new Student(name, age, course);
    }

    public static Student getInstance(Person other) {
        return new Student(other.getName(), other.getAge());
    }

    //Object's methods
    @Override
    public String toString() {
        return "Student[name=" + getName() + ",age=" + getAge() + ",course=" + getCourse() + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Student otherStudent = (Student) other;
        return this.getName() == otherStudent.getName() && this.getAge() == otherStudent.getAge()
                && this.getCourse() == otherStudent.getCourse() && this.hashCode() == otherStudent.hashCode();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getCourse());
    }
}
