import java.util.*;

//Time Complexity: O(n + m) for union of unsorted arrays

public class UnionUnsorted {
    public static List<Integer> union(int[] A, int[] B) {
        Set<Integer> set = new HashSet<>();

        // Add all elements from A
        for (int num : A) {
            set.add(num);
        }

        // Add all elements from B
        for (int num : B) {
            set.add(num);
        }

        // Convert to list (unsorted)
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] A = { 7, 3, 1, 5 };
        int[] B = { 3, 9, 5, 2 };

        List<Integer> result = union(A, B);
        System.out.println(result); // Order is not guaranteed
    }
}
