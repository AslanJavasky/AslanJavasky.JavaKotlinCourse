package mod3_exception.lesson3_hierarchy_of_exceptions;

import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {

        int zero = 1;
        String str = "some string";

        int num = Integer.parseInt(str);

        try {
            System.out.println("15/zero=" + 15 / zero);
            System.out.println("The length of string is " + str.length());
//            throw new NullPointerException();
            int[] arr = {4, 8, 15};
//            int elem=arr[15];//ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 3
            int elem = arr[1];

            num = Integer.parseInt(str);//NumberFormatException: For input string: "some string"

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println("The str is null." + e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("The end of try-catch block");
        }

        System.out.println("The end of program!");

    }
}
