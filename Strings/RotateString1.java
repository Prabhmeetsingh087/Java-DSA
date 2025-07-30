public class RotateString1 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }
}

/*
 * • Concatenate the string to itself.
 * - Example: s = "abcde" → s + s = "abcdeabcde"
 * 
 * • All possible rotations of s will appear in this concatenated string.
 * - Example rotations:
 * abcde → bcdea → cdeab → deabc → eabcd
 * 
 * • Observation:
 * - Every rotated version of s is a substring of s + s.
 * 
 * • Conclusion:
 * - To check if goal is a rotation of s:
 * 1. Ensure both strings have the same length.
 * 2. Check if goal is a substring of s + s.
 * 
 */