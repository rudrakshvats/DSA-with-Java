package LeetCode;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int windowLength = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                windowLength += 1;
            }
        }

        int maxLength = windowLength;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                windowLength += 1;
            }
            if (isVowel(s.charAt(i - k))) {
                windowLength -= 1;
            }

            maxLength = Math.max(maxLength, windowLength);

            if (maxLength == k) return k;
        }

        return maxLength;
    }

    private static boolean isVowel(char ch) {
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u');
    }
}
