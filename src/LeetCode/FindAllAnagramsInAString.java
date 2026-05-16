package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) return result;

        int[] pArray = new int[26];
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pArray[ch - 'a']++;
        }

        int k = p.length();
        int[] windowArray = new int[pArray.length];
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            windowArray[ch - 'a']++;
        }

        if (Arrays.equals(pArray, windowArray)) result.add(0);

        for (int i = k; i < s.length(); i++) {
            char outgoingChar = s.charAt(i - k);
            windowArray[outgoingChar - 'a']--;

            char incomingChar = s.charAt(i);
            windowArray[incomingChar - 'a']++;

            if (Arrays.equals(pArray, windowArray)) result.add(i - k + 1);
        }

        return result;
    }
}
