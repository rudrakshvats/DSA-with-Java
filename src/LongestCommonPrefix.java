public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] stringArray1 = {"flower","flow","flight"};
        String output = "";

        // first we find length of the string with the least length
        int minimum = stringArray1[0].length();
        for (String s : stringArray1) {
            minimum = Math.min(s.length(), minimum);
        }

        //output = findCommonPrefixForStringArray(stringArray1, minimum, output);
        output = longestCommonPrefix(stringArray1);

        System.out.println(output);
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

        if (shortestString.isEmpty()) {
            return common;
        }

        String[] shortestStringArray = shortestString.split("");

        for (int i = 0; i < shortestStringArray.length; i++) {
            String s = shortestStringArray[i];

            for (String str: strs) {
                if (!s.equals(String.valueOf(str.charAt(i)))) {
                    return common;
                }
            }

            common += s;
        }

        return common;
    }
}
