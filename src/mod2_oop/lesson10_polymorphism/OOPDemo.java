package mod2_oop.lesson10_polymorphism;

import mod2_oop.lesson10_polymorphism.Person;
import mod2_oop.lesson10_polymorphism.PersonKt;
import mod2_oop.lesson10_polymorphism.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {

        Person aslan = new Person("Aslan Javasky", 33);
        Student johny = new Student("John", 20, 1);
        Person ivan = new Student("Ivan Ivanovitch");

        System.out.println("Person instance aslan.sayHello():");
        aslan.sayHello();
        System.out.println("Student instance johny.sayHello():");
        johny.sayHello();
        System.out.println("Student instance of Person superclass ivan.sayHello():");
        ivan.sayHello();

        System.out.println("ivan instanceof Student:" + (ivan instanceof Student));
        System.out.println("ivan instanceof Person:" + (ivan instanceof Person));
        System.out.println("johny instanceof Student:" + (johny instanceof Student));
        System.out.println("johny instanceof Person:" + (johny instanceof Person));
//        System.out.println("johny instanceof Person:" + (johny instanceof Teacher));
//        if (ivan instanceof Person){
//            ...
//        }




    }
}
