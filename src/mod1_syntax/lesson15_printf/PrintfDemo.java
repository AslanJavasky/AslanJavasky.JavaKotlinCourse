package mod1_syntax.lesson15_printf;

import java.time.LocalDateTime;

public class PrintfDemo {
    public static void main(String[] args) {

        //%s-string-строка
        var name="Aslan";
        System.out.printf("Hello, %s! %n",name);

        //%d-десятичное число
        int age=33;
        System.out.printf("I'm %d years old. %n",age);

        //%f-дробное число
        double height=1.78;
        System.out.printf("My height is %5.2f m. %n",height);

        //%tF %tT-дата время
        LocalDateTime now= LocalDateTime.now();
        System.out.printf("Current date and time: %tF %tT",now,now);





    }
}
