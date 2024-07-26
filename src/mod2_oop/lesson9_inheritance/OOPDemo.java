package mod2_oop.lesson9_inheritance;

import mod2_oop.lesson9_inheritance.Person;
import mod2_oop.lesson9_inheritance.PersonKt;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {

//        Person aslan = Person.getInstance("Aslan Javasky", 33);
//        Student johny = Student.getInstance("John");

        Person aslan = new Person("Aslan Javasky", 33);
        Student johny = new Student("John",20,1);

        aslan.sayHello();
        johny.sayHello();
    }
}
