public class LargestElement {

    public static int findLargest(int[] nums) {
        int max = nums[0]; // Assume first element is largest

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if current element is bigger
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 25, 3, 99, 56, 72 };
        int largest = findLargest(nums);

        System.out.println("Largest element: " + largest);
    }
}
