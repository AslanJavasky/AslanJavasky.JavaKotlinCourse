package mod1_syntax.lesson9_AND_OR;

public class Operators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        //операции сравнения
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLess = a < b;
        boolean isLessOrEqual = a <= b;

        //And(&&) OR(||)
        boolean aIsGreaterThanB = a > b;//true
        boolean aIsEqualOfB = a == b;//false
        //Конъюнкция
        boolean logicalAND = aIsGreaterThanB && aIsEqualOfB;
        //Дизъюнкция
        boolean logicalOR = aIsGreaterThanB || aIsEqualOfB;

        System.out.println("The result of expression: 10>3 AND 10==3 is " + logicalAND);
        System.out.println("The result of expression: 10>3 OR 10==3 is " + logicalOR);


    }
}
