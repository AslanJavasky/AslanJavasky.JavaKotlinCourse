package mod2_oop.lesson15_enum_class;

import static mod2_oop.lesson15_enum_class.DayOfWeek.*;

public class EnumDemo {
    public static void main(String[] args) {

//        System.out.println("Today is " + DayOfWeek.SUNDAY);
//        System.out.println("Today is sundey!");

        DayOfWeek today = DayOfWeek.SUNDAY;
        if (today == SATURDAY || today == SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday");
        }

        System.out.println(FRIDAY+" on russian language is "+FRIDAY.getRussianTranslate());


    }
}
