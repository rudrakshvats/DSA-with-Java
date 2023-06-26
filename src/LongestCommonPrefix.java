public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] stringArray1 = {"flower", "flow", "flight"};
        String output = "";

        // first we find length of the string with the least length
        int minimum = stringArray1[0].length();
        for (String s : stringArray1) {
            minimum = Math.min(s.length(), minimum);
        }

        output = findCommonPrefixForStringArray(stringArray1, minimum, output);

        System.out.println(output);
    }

    private static String findCommonPrefixForStringArray(String[] stringArray1, int minimum, String output) {
        // now the common prefix might be present in each and every other string as well
        /*
        running the loop only for the minimum length because the common prefix can only be maximum equal to the length
        of the string with the least length
         */
        for (int i = 0; i < minimum; i++) {
            // finding the first char which can be common from the first String
            char currentChar = stringArray1[0].charAt(i);

            // checking if the current char is present in each string of the string array, if not then return the output
            for (String string: stringArray1) {
                if (string.charAt(i) != currentChar) {
                    return output;
                }
            }

            // else add currentChar to output variable
            output = output + currentChar;
        }

        return output;
    }
}
