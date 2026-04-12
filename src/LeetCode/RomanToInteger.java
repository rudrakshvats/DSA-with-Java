package LeetCode;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();
        int sum = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        String[] stringArray = s.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (i + 1 < stringArray.length) {
                if (map.get(stringArray[i]) > map.get(stringArray[i + 1])) {
                    sum += map.get(stringArray[i]);
                } else if (map.get(stringArray[i]) < map.get(stringArray[i + 1])) {
                    int value = map.get(stringArray[i + 1]) - map.get(stringArray[i]);
                    sum += value;
                    i += 1;
                } else {
                    sum += map.get(stringArray[i]);
                }
            } else {
                sum += map.get(stringArray[i]);
            }
        }

        return sum;
    }
}
