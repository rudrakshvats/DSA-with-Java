import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    /**
     * for checking the valid parenthesis, first we will use a stack. This stack will always contain the opening type of
     * parenthesis. We will iterate through the String we pass as an argument.
     * 1. if we encounter any opening parenthesis we will push it into our stack
     * 2. next we will iterate our string to check if we encounter any closing bracket or opening bracket, if we encounter
     * any opening then perform step 1 else pop out the front most element of the stack to check if it is the opening
     * of the closing parenthesis if yes then move on to the next element of the string else declare it invalid
     * 3. after iterating the whole string if the stack is empty then declare the string as valid else delare invalid
     * 4. if we encounter the first element of the string as closing parenthesis then declare the string as invalid
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Please enter a string with parenthesis to check if it contains valid parenthesis or not: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Stack<Character> stack = null;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == '[' ||string.charAt(i) == '{') {
                stack.push(string.charAt(i));
            }
            else {
                if (stack.empty()) {
                    System.out.println(false);
                }
                else {
                    Character c = stack.get(stack.pop());
                    if (string.charAt(i) == '(' && c == ')') {
                        System.out.println(true);
                    }
                    if (string.charAt(i) == '[' && c == ']') {
                        System.out.println(true);
                    }
                    if (string.charAt(i) == '{' && c == '}') {
                        System.out.println(true);
                    }
                    else {
                        System.out.println(false);
                    }
                }
            }
        }

        if (stack.empty()) {
            System.out.println(true);
        }
    }
}
