package mod9_algorithms.lesson13_euclidean_algorithm;

//NOD 6(2,3) 8(2^4)
//NOD 15(3,5) 45(3,3,5)

public class EuclideanAlgorithm {

    public static int nodWhile(int first, int second) {

        //O(log min(n,m))

        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("numbers must be greater than or equal zero");
        }

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;

    }

    public static int nodRec(int first, int second) {
        //O(log min(n,m))

        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("numbers must be greater than or equal zero");
        }
        if (second == 0) return first;
        return nodRec(second, first % second);

    }



    public static void main(String[] args) {
        System.out.println(nodWhile(6,8));
        System.out.println(nodWhile(45,15));

        System.out.println(nodRec(6,8));
        System.out.println(nodRec(45,15));
    }
}
