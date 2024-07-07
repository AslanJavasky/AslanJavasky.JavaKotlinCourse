package syntax.lesson7_final;

public class Final {
    public static void main(String[] args) {

        final int firstInt = 4, secondInt = 8;

//        secondInt = 15;
        System.out.println("firstInt= " + firstInt + ", secondIn= " + secondInt);

        final var nameOfBoss = "Aslan Javasky";
//        nameOfBoss="Aslan!";
        System.out.println(nameOfBoss);
    }
}
