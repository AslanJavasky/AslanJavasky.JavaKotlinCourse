package mod2_oop.lesson14_functional_interface;


public class OOPDemo {
    public static void main(String[] args) {
        //with classes which implements Greeting interface
//        Greeting englishGreeting = new EnglishGreeting();
//        englishGreeting.sayHello();
//        Greeting frenchGreeting = new FrenchGreeting();
//        frenchGreeting.sayHello();

        Greeting englishGreeting = name -> System.out.println("Hello, " + name + "!");
        englishGreeting.sayHello("Aslan Javasky");

        new Greeting(){
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, "+name+"!");
            }
        }.sayHello("Aslan Javasky");

        Greeting frenchGreeting = name -> System.out.println("Bonjour, " + name + "!");
        frenchGreeting.sayHello("John Smith");

    }
}
