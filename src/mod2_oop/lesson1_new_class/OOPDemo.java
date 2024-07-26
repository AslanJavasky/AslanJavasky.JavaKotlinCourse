package mod2_oop.lesson1_new_class;

import mod2_oop.lesson2_constructors.Person;
import mod2_oop.lesson3_encapsulation.PersonKt;

public class OOPDemo {
    public static void main(String[] args) {

        Person aslan = new Person();
        aslan.name = "Aslan Javasky";
        aslan.age = 33;
        aslan.sayHello();

        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 23;
        ivan.sayHello();

        PersonKt kotlinPerson = new PersonKt();
        kotlinPerson.setName("John");
        kotlinPerson.setAge(35);
        kotlinPerson.sayHello();


    }
}
