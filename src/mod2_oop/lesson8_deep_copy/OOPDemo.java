package mod2_oop.lesson8_deep_copy;

import mod2_oop.lesson8_deep_copy.Person;
import mod2_oop.lesson8_deep_copy.PersonKt;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    public static void main(String[] args) throws ParseException {
        //копирование по значению
        int int1 = 4;
        int int2 = 8;
        int int3 = int1;
        int3 = 15;
//        System.out.println(int1 == int2);
//        System.out.println(int1);

        //копирование по ссылке
        Person aslan = Person.getInstance("Aslan");
        Person john = Person.getInstance("John");
//        Person somePerson = aslan;//by reference
        Person somePerson=Person.getInstance(aslan);//deep copy
        somePerson.setName("Peter");
        System.out.println(aslan.getName());
    }
}
