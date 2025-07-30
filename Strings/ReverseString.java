
public class ReverseString {
    public static void main(String[] args) {
        String str = "Prabhmeet";
        char[] chars = new char[str.length()];
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            chars[j] = str.charAt(i);
        }
        String reversed = new String(chars);
        System.out.println(reversed);
    }
}

// time complexity- 0(n)
// no extra array used
