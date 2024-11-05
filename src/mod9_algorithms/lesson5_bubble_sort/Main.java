package mod9_algorithms.lesson5_bubble_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 23, 42, 16, 15, 8};

        System.out.println("arr before sort:" + Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println("arr after sort:" + Arrays.toString(arr));


    }
}
