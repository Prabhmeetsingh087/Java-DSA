import java.util.HashMap;

public class AnagramCheck {

    public static boolean areAnagrams(String s1, String s2) {
        // Step 1: If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Count characters of first string
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        // Step 3: Subtract counts using second string
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (!countMap.containsKey(c)) {
                return false; // character not present in first string
            } else {
                countMap.put(c, countMap.get(c) - 1);
                if (countMap.get(c) == 0) {
                    countMap.remove(c); // remove key when count is zero
                }
            }
        }

        // Step 4: If map is empty, both strings are anagrams
        return countMap.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("hello", "world")); // false
    }
}
