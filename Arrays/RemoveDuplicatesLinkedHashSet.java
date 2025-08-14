import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesLinkedHashSet {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 2, 3, 4, 4, 5 };

        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        Integer[] uniqueArr = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(uniqueArr));
    }
}
