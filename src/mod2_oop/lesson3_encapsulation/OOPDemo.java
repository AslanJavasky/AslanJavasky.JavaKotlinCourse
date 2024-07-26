package mod2_oop.lesson3_encapsulation;

import mod2_oop.lesson3_encapsulation.Person;
import mod2_oop.lesson3_encapsulation.PersonKt;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {

        //java
        Person aslan = new Person();
        aslan.setName("Aslan Javasky");
        aslan.setAge(33);
        aslan.sayHello();

        Person john = new Person("John Smith", 40);
        john.sayHello();

        Person ivan = new Person("Ivan");
        ivan.sayHello();

        //kotlin
        PersonKt kotlinPerson = new PersonKt();
        kotlinPerson.setName("Gabriella");
        kotlinPerson.setAge(35);
        kotlinPerson.sayHello();

        var selena = new PersonKt("Selena Gomez");
        selena.setBirth(new SimpleDateFormat("dd.MM.yyyy").parse("22.07.1992"));
        selena.sayHello();

        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(
                selena.getBirth()));



    }
}
