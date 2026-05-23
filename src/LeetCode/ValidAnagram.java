package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

//    public static boolean isAnagram(String s, String t) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                Integer value = map.get(s.charAt(i));
//                value += 1;
//                map.replace(s.charAt(i), value);
//            } else {
//                map.put(s.charAt(i), 1);
//            }
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            if (map.containsKey(t.charAt(i))) {
//                Integer value = map.get(t.charAt(i));
//                if (value > 1) {
//                    value -= 1;
//                    map.replace(t.charAt(i), value);
//                } else map.remove(t.charAt(i));
//            } else return false;
//        }
//
//        return map.isEmpty();
//    }

    public static boolean isAnagram(String s, String t) {
        // for optimal approach we are using 26 size array instead of hashmap
        int[] array = new int[26];

        // increment for every character in s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            array[ch - 'a']++;
        }

        // decrement for evert character in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            array[ch - 'a']--;
            // if any character value is less than 0 that means that character is not present in s
            if (array[ch - 'a'] < 0) return false;
        }

        // check if all elements are 0 in array, that means s and t are anagrams
        for (int i: array) {
            if (i != 0) return false;
        }

        return true;
    }
}
