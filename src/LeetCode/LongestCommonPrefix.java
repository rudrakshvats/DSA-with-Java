package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String common = "";
        if (strs.length == 0) return common;

        // for the first step we will find the shortest String in the array
        String shortestString = strs[0];

        for (String str: strs) {
            if (str.length() < shortestString.length()) {
                shortestString = str;
            }
        }

        // now we have the shortest string of the string array
        // if the shortest string is empty then we can simply return the empty string because nothing is common

        if (shortestString.isEmpty()) {
            return common;
        }

        // next we will run the loop on shortest string, so we convert it to string array

        String[] shortestStringArray = shortestString.split("");

        // now we run the loop on shortest string array
        for (int i = 0; i < shortestStringArray.length; i++) {

            // fetch the string at the index value from 0 to string array length - 1
            String s = shortestStringArray[i];

            // now we check if the string at the index value i is present at same index for all strings or not
            for (String str: strs) {
                // if the value is not present for any string at the particular index value then we can simply return common string at this point
                if (!s.equals(String.valueOf(str.charAt(i)))) {
                    return common;
                }
            }

            // we will come to this point once the string at index value i is present at index value for all strings, and we will append it to our common string variable
            common += s;
        }

        return common;
    }
}
