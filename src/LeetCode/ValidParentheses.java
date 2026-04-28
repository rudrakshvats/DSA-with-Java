package LeetCode;

import java.util.Arrays;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        String[] strArray = s.split("");
        boolean isValid = false;

        for (String str : strArray) {
            if (s.isEmpty()) return isValid;
            if (str.equals("(") && Arrays.asList(strArray).contains(")")) {
                isValid = true;
                s = s.replace("(", "").replace(")", "");
            } else if (str.equals(")") && Arrays.asList(strArray).contains("(")) {
                isValid = true;
                s = s.replace("(", "").replace(")", "");
            } else if (str.equals("{") && Arrays.asList(strArray).contains("}")) {
                isValid = true;
                s = s.replace("{", "").replace("}", "");
            } else if (str.equals("}") && Arrays.asList(strArray).contains("{")) {
                isValid = true;
                s = s.replace("{", "").replace("}", "");
            } else if (str.equals("[") && Arrays.asList(strArray).contains("]")) {
                isValid = true;
                s = s.replace("[", "").replace("]", "");
            } else if (str.equals("]") && Arrays.asList(strArray).contains("[")) {
                isValid = true;
                s = s.replace("[", "").replace("]", "");
            } else {
                isValid = false;
            }
        }

        return isValid;
    }
}
