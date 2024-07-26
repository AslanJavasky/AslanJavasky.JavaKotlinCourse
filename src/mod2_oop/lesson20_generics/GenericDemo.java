package mod2_oop.lesson20_generics;

public class GenericDemo {
    public static void main(String[] args) {


//        Person<? super Number> person = new Person<>("1","Aslan");
        Person<?> person2 = new Person<>(1,"Aslan");
//        person.sayHello();
//        System.out.println(person.getId());

    }
}
