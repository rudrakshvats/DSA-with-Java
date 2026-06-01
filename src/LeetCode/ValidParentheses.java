package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

//    public static boolean isValid(String s) {
//        String[] strArray = s.split("");
//        boolean isValid = false;
//
//        for (String str : strArray) {
//            if (s.isEmpty()) return isValid;
//            if (str.equals("(") && Arrays.asList(strArray).contains(")")) {
//                isValid = true;
//                s = s.replace("(", "").replace(")", "");
//            } else if (str.equals(")") && Arrays.asList(strArray).contains("(")) {
//                isValid = true;
//                s = s.replace("(", "").replace(")", "");
//            } else if (str.equals("{") && Arrays.asList(strArray).contains("}")) {
//                isValid = true;
//                s = s.replace("{", "").replace("}", "");
//            } else if (str.equals("}") && Arrays.asList(strArray).contains("{")) {
//                isValid = true;
//                s = s.replace("{", "").replace("}", "");
//            } else if (str.equals("[") && Arrays.asList(strArray).contains("]")) {
//                isValid = true;
//                s = s.replace("[", "").replace("]", "");
//            } else if (str.equals("]") && Arrays.asList(strArray).contains("[")) {
//                isValid = true;
//                s = s.replace("[", "").replace("]", "");
//            } else {
//                isValid = false;
//            }
//        }
//
//        return isValid;
//    }

    public static boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch: s.toCharArray()) {
            if (deque.isEmpty() && isOpeningBracket(ch)) deque.push(ch);
            else {
                if (!deque.isEmpty() && isClosingBracket(ch)) {
                    if (ch == ')' && deque.peek() != '(') return false;
                    else if (ch == ']' && deque.peek() != '[') return false;
                    else if (ch == '}' && deque.peek() != '{') return false;
                    else deque.pop();
                } else deque.push(ch);
            }
        }

        return deque.isEmpty();
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean isClosingBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }
}
