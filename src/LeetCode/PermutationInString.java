package LeetCode;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    private static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            s1Freq[ch - 97]++;
        }

        int k = s1.length();

        int[] windowFreq = new int[26];
        for (int i = 0; i < k; i++) {
            char ch = s2.charAt(i);
            windowFreq[ch - 97]++;
        }

        if (Arrays.equals(s1Freq, windowFreq)) return true;

        for (int i = k; i < s2.length(); i++) {
            char removingChar = s2.charAt(i - k);
            windowFreq[removingChar - 97]--;
            char incomingChar = s2.charAt(i);
            windowFreq[incomingChar - 97]++;
            if (Arrays.equals(windowFreq, s1Freq)) return true;
        }

        return false;
    }
}
