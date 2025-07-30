public class Palindrome2 {
    public static void main(String[] args) {
        String sentence = "madam level apple noon civic";

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        for (String word : words) {

            String cleaned = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (!cleaned.isEmpty()) {
                if (isPalindrome(cleaned)) {
                    System.out.println(word + " Palindrome");
                } else {
                    System.out.println(word + " Not Palindrome");
                }
            }
        }
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
