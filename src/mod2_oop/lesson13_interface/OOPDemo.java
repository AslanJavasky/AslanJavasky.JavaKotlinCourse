package mod2_oop.lesson13_interface;

import mod2_oop.lesson13_interface.Person;
import mod2_oop.lesson13_interface.PersonKt;
import mod2_oop.lesson13_interface.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {

        Person aslan=Student.getInstance("Aslan",33,5);
        Person ivan=Student.getInstance("Ivan",32,4);
        Person aslan2=Student.getInstance("Aslan",33,5);
        System.out.println(aslan.toString());
        System.out.println(aslan.equals(ivan));
        System.out.println(aslan.hashCode());

        System.out.println(aslan.equals(aslan2));





    }
}
