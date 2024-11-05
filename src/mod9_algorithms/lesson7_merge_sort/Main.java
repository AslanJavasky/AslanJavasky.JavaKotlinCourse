package mod9_algorithms.lesson7_merge_sort;

import mod9_algorithms.lesson3_collection_framework.L3_1_Collection.Collection;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] arr = {8, 16, 42, 15, 4, 23};
//        System.out.println(Arrays.toString(arr));
//        MergeSort.megreSort(arr);
//        System.out.println(Arrays.toString(arr));

//        Collections.sort();

        System.out.println(Arrays.toString(arr));
        MergeSortKt.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
