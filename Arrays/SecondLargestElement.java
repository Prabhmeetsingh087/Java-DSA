public class SecondLargestElement {

    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements equal).");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 25, 3, 99, 56, 72 };
        int secondLargest = findSecondLargest(nums);

        if (secondLargest != -1) {
            System.out.println("Second Largest element: " + secondLargest);
        }
    }
}
