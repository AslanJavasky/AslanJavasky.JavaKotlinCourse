package mod2_oop.lesson2_constructors;

public class OOPDemo {
    public static void main(String[] args) {

        //java
        Person aslan = new Person();
        aslan.name = "Aslan Javasky";
        aslan.age = 33;
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
        selena.sayHello();

    }
}
