package syntax.lesson5_variables;

public class Variables {
    public static void main(String[] args) {

        //byte -128..127
        //System.out.println(Integer.parseInt("11111111",2));
        byte byteNumber;
        byteNumber = 127;
        System.out.println("The byte number: " + byteNumber);

        //short -32768...32767
        short shortNumber = 500;
        System.out.println("The short number: " + shortNumber);

        // int (-2 billion...2 billion)
        int intNumber = 50000000;
        System.out.println("The int number: " + intNumber);

        //long 8 tytes
        long longNumber = 999_999_999L;
        System.out.println("The long number: " + longNumber);

        //float 4bytes
        float floatNumber = 3.14F;
        System.out.println("The float number: " + floatNumber);

        //double 8bytes
        double doubleNumber = 3.14;
        System.out.println("The double number :" + doubleNumber);

        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.isNaN(1.0 / 0.0));

        char charSymbol = 'A';
        System.out.println("The char variable: " + charSymbol);

        boolean booleanVariable;
        booleanVariable = true;
        booleanVariable = false;
        System.out.println("The boolean variable is "+booleanVariable);

        var variableNum=10L;

        int firstNumber, secondNumber;
        firstNumber=5;
        secondNumber=10;

        //casting
        //byteNumber=127
        short varForCasting=byteNumber;
        System.out.println("After casting varForCasting:"+varForCasting);

        int intNewVar=varForCasting;
        System.out.println("After casting intNewVar:"+intNewVar);

        int intVariable=6_000_012;
        byte byteNewVar= (byte) intVariable;
        System.out.println("After casting byteNewVar:"+byteNewVar);

        var doubleVar=4.18;
        int newInteger= (int) doubleVar;
        System.out.println("After casting newInteger:"+newInteger);

    }
}
