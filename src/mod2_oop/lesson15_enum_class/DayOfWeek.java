package mod2_oop.lesson15_enum_class;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianDayOfWeek;

    DayOfWeek(String russianDayOfWeek){
        this.russianDayOfWeek=russianDayOfWeek;
    }

    public String getRussianTranslate(){
        return this.russianDayOfWeek;
    }


}
