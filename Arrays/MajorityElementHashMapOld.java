import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MajorityElementHashMapOld {

    public static int findMajorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        int n = nums.length;

        // Count frequencies (no getOrDefault)
        for (int i = 0; i < nums.length; i++) {
            if (freqMap.containsKey(nums[i])) {
                freqMap.put(nums[i], freqMap.get(nums[i]) + 1);
            } else {
                freqMap.put(nums[i], 1);
            }
        }

        // Find element with frequency > n/2 (no enhanced for loop)
        Set<Map.Entry<Integer, Integer>> entries = freqMap.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int majority = findMajorityElement(nums);

        if (majority != -1) {
            System.out.println("Majority Element: " + majority);
        } else {
            System.out.println("No majority element found.");
        }
    }
}
// time complexity: O(n)
// space complexity: O(n)