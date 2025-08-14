public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int pos = 0; // Position for the next non-zero

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        // Step 2: Fill remaining positions with zero
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
