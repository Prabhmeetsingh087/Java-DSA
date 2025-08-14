import java.util.*;

public class IntersectionSorted {
    public static List<Integer> intersection(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                i++;
            } else if (A[i] > B[j]) {
                j++;
            } else { // Equal
                if (result.isEmpty() || result.get(result.size() - 1) != A[i]) {
                    result.add(A[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 2, 3, 4 };
        int[] B = { 2, 2, 3, 5 };
        System.out.println(intersection(A, B)); // [2, 3]
    }
}
