package mod1_syntax.lesson24_array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arrNumbers = new int[6];
        arrNumbers[0] = 4;
        arrNumbers[1] = 8;
        arrNumbers[2] = 15;
        arrNumbers[3] = 16;
        arrNumbers[4] = 23;
        arrNumbers[5] = 42;
//        arrNumbers[6]=108; ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(arrNumbers));
        System.out.println("The 5th element of array is " + arrNumbers[4]);

        //length-для получении длины массива
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println("The index is " + i + ", the value is " + arrNumbers[i]);
        }

        int[] arrNumbers2 = {4, 8, 15, 16, 23, 42};

    }
}
