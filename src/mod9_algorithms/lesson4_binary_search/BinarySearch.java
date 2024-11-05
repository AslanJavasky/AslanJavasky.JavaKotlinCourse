package mod9_algorithms.lesson4_binary_search;


public class BinarySearch {

    public static int binarySearchIter(int[] arr, int target) {
        //O(log n)
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr, int target) {
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchHelper(arr, target, mid + 1, high);
        } else {
            return binarySearchHelper(arr,target,low, mid - 1);
        }
    }

}
