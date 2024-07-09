package mod1_syntax.lesson23_BigDecimal_BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {

        //BigDecimal
        BigDecimal number1 = new BigDecimal("1231423453445765687.4564454354354367");
        BigDecimal number2 = BigDecimal.valueOf(345346547573.234234234234);

        BigDecimal sum = number1.add(number2);//number1+number2
        BigDecimal tax = sum.multiply(new BigDecimal("0.13"));

        System.out.println("Total salary: " + sum);
        System.out.println("Tax: " + tax);

        //BigInteger
        BigInteger number3 = new BigInteger("346545656767878978976845325345436457567");
        BigInteger number4 = BigInteger.valueOf(342345435);

        BigInteger difference = number3.subtract(number4);
        System.out.println("number3 - number4 = " + difference);
    }
}
