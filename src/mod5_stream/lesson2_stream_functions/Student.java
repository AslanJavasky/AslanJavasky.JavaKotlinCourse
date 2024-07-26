package mod5_stream.lesson2_stream_functions;

import java.util.Objects;

public class Student  {

    private String name;
    private Integer age;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
        super();
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, int course) {
        this(name, age);
        this.course = course;
    }

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
