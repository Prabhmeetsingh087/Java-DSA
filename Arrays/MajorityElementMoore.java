public class MajorityElementMoore {

    public static int findMajorityElement(int[] nums) {
        // Step 1: Find a candidate
        int candidate = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate (optional if guaranteed majority exists)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // If majority exists (count > n/2), return it, else -1
        return count > nums.length / 2 ? candidate : -1;
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
// space complexity: O(1)