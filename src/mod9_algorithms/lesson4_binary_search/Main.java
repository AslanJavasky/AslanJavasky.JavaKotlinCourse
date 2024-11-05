package mod9_algorithms.lesson4_binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        //O(log n)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println(BinarySearchKt.binarySearchIter(arr, 3));

        System.out.println(BinarySearchKt.binarySearchRec(arr, 3));
        System.out.println(BinarySearchKt.binarySearchRec(arr, 11));
        System.out.println(BinarySearchKt.binarySearchRec(arr, 108));

        System.out.println(
                Collections.binarySearch(Arrays.stream(arr).boxed().toList(), 3)
        );

    }
}
