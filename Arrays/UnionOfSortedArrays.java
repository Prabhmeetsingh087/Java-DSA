import java.util.*;

//two pointers approach for union of sorted arrays
//Time Complexity: O(n + m + klogk), where n and m are the lengths of the two arrays

public class UnionOfSortedArrays {
    public static List<Integer> union(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != A[i])
                    result.add(A[i]);
                i++;
            } else if (A[i] > B[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != B[j])
                    result.add(B[j]);
                j++;
            } else { // Equal values
                if (result.isEmpty() || result.get(result.size() - 1) != A[i])
                    result.add(A[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements from A
        while (i < A.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != A[i])
                result.add(A[i]);
            i++;
        }

        // Add remaining elements from B
        while (j < B.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != B[j])
                result.add(B[j]);
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 4, 5 };
        int[] B = { 2, 3, 5, 6 };
        System.out.println(union(A, B));
    }
}
