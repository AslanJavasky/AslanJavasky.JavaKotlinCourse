package syntax.lesson10_String;

public class StringDemo {
    public static void main(String[] args) {

        String strName = "Aslan";
        String strLastname = new String("Javasky");
        System.out.println(strName + " " + strLastname);

        //equals
        String firstString = "Java";
        var secondString = "java";
        System.out.println("Is two strings equals: " + firstString.equals(secondString));
        System.out.println("Is two strings equals(ignoreCase): " + firstString.equalsIgnoreCase(secondString));

        //получение размера строки
        System.out.println("The length of strName: " + strName.length());

        //Получение подстроки
        String greeting = "Hello, World!";
        String substring = greeting.substring(
                greeting.indexOf("W"),//7
                greeting.indexOf("!")//12
        );
        System.out.println(substring);

        //Проверка наличия подстроки
        String greetingWithUpperCase = greeting.toUpperCase();
        String greetingWithLowerCase = greeting.toLowerCase();
        System.out.println(greetingWithLowerCase);
        System.out.println("The string contains \"World\": " + greetingWithLowerCase.contains("world"));

        //Удаление пробелов (trim)
        var login = "   aslan_javasky   ";
        String loginAfterTrim = login.trim();
        System.out.println("loginAfterTrim " + loginAfterTrim);

        //replace()
        var loginAfterReplace = login.trim().replace("_", ".");
        System.out.println("loginAfterReplace " + loginAfterReplace);

        //StringBuffer-для многопоточного
        StringBuilder sb = new StringBuilder("Hello,");
        sb.append("Aslan");
        sb.append(" ");
        sb.append("Javasky!");
        System.out.println(sb);


    }
}
