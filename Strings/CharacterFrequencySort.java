import java.util.*;

public class CharacterFrequencySort {

    public static Character[] sortCharacters(String s) {
        // Step 1: Count frequency
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        // Step 2: Convert map keys to a list
        List<Character> characters = new ArrayList<>(freqMap.keySet());

        // Step 3: Sort by frequency (desc) then alphabetically
        Collections.sort(characters, new Comparator<Character>() {
            public int compare(Character c1, Character c2) {
                int freqCompare = freqMap.get(c2).compareTo(freqMap.get(c1));
                if (freqCompare == 0) {
                    return Character.compare(c1, c2); // alphabetical
                }
                return freqCompare;
            }
        });

        // Step 4: Convert to array
        return characters.toArray(new Character[0]);
    }

    public static void main(String[] args) {
        String s = "banana";
        Character[] result = sortCharacters(s);
        System.out.println(Arrays.toString(result)); // [a, n, b]
    }
}
