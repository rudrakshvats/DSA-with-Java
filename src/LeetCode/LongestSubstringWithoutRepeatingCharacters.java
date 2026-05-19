package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        // take use of HashMap to use containsKey and remove method
        Map<Character, Integer> map = new HashMap<>();
        // use a left slow pointer for shrinkage
        int left = 0;
        // use a right fast pointer for expansion
        int right = 0;
        // a variable for storing length
        int length = 0;

        // run a loop until we reach at the end of the String s
        while (right < s.length()) {
            // first extract the character at right position, this will be the incoming character and increment right by 1
            char incoming = s.charAt(right++);
            // check if it is present in map or not, if yes then we can shrink the map
            // why we are shrinking? because whenever we get any duplicate character while traversing, we need to omit the
            // the character at left position because that doesn't come under substring part, it can be counted as a subsequence
            while (map.containsKey(incoming)) {
                // extract the character at left position, this will be the outgoing character and increment left by 1
                char outgoing = s.charAt(left++);
                // remove the outgoing character by remove method
                map.remove(outgoing);
            }

            // then simply use put method to add incoming character into map
            map.put(incoming, 1);

            // catch the maximum length inside the length variable
            length = Math.max(length, map.size());
        }

        return length;
    }
}
