package mod9_algorithms.lesson6_quick_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("arr before sort:" + Arrays.toString(arr));

        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println("arr after sort:" + Arrays.toString(arr));
    }
}
