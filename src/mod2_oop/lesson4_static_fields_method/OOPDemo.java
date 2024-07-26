package mod2_oop.lesson4_static_fields_method;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {

//        Person.getKIND();
        //java
        Person aslan = new Person();
        aslan.setName("Aslan Javasky");
        aslan.setAge(33);
        aslan.sayHello();
        System.out.println("The kind of Person is " + Person.KIND);

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
        System.out.println("The kind of PersonKt is " + PersonKt.KIND);
        selena.setBirth(new SimpleDateFormat("dd.MM.yyyy").parse("22.07.1992"));
        selena.sayHello();

        System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(
                selena.getBirth()));


    }
}
