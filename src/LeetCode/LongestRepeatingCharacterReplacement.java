package LeetCode;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        // edge case
        if (s.length() == 1) return s.length();

        // take two pointers where left is for shrinking and right is for expanding
        int left = 0;
        int right = 0;

        // take an constant space array which can store any 26 capital character
        int[] freqArray = new int[26];
        // one variable for maximum frequency of a character in window
        int maxFrequency = 0;
        // final variable for storing result
        int result = 0;

        // run loop until we reach end of String s
        while (right < s.length()) {
            // incoming character will always expand window
            char incoming = s.charAt(right);
            // increment its value in character array
            freqArray[incoming - 'A']++;
            // check maxFrequency of that character and store if it is greater than maxFrequency
            maxFrequency = Math.max(maxFrequency, freqArray[incoming - 'A']);

            // run loop for checking condition to check if the window has maximum replacements more than k, because we are only allowed k replacements to be made, otherwise we will shrink the window
            while ((right - left + 1) - maxFrequency > k) {
                // outgoing character will shrink the window
                char outgoing = s.charAt(left++);
                // decrement the frequency of outgoing character from character array, but here we do not have to check maxFrequency again because it doesn't hamper the result
                freqArray[outgoing - 'A']--;
            }

            // we will catch max window length in result variable before incrementing right pointer
            result = Math.max(result, right - left + 1);
            right += 1;
        }

        return result;
    }
}
