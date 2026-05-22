package LeetCode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // for the result, we need to create a similar arraylist
        List<List<String>> result = new ArrayList<>();

        // since searching has O(1) complexity for key and value, we will use HashMap
        Map<String, List<String>> map = new HashMap<>();
        // run a loop on String array
        for (String str: strs) {
            // we will keep frequencies inside a 26 size array
            int[] array = new int[26];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                array[ch - 'a']++;
            }
            // here we will use StringBuilder to append the key value to keep it mutable
            StringBuilder key = new StringBuilder();
            List<String> value;
            // we will create a key using integer array
            for (int j : array) key.append(j).append("#");
            // if the map contains same key then we will simply add the string in the value list
            if (map.containsKey(key.toString())) {
                value = map.get(key.toString());
                value.add(str);
            }
            // else we will simply put key as key and value as a new array list
            else {
                value = new ArrayList<>();
                value.add(str);
                map.put(key.toString(), value);
            }
        }

        // next we will run a for each loop on map, and for every entry we will add the value in the result arraylist
        map.forEach((x, y) -> {
            result.add(y);
        });

        return result;
    }
}
