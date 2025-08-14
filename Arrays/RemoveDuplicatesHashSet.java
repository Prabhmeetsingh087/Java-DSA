import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesHashSet {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 4, 4, 5 };

        // Convert to HashSet (removes duplicates)
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));

        // Convert back to array
        Integer[] uniqueArr = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(uniqueArr));
    }
}
