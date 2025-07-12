package StriverSDESheet;

import java.util.Scanner;

public class LongestUnrepeatingSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(findLongestUnrepeatingSubstring(inputString));
    }

    private static Integer findLongestUnrepeatingSubstring(String s) {
        int numberOfSpaces = 0;
        String finalString = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == ' ') {
                numberOfSpaces = 1;
            } else if (s.length() == 1) {
                finalString = String.valueOf(s.charAt(i));
            } else {
                if (i + 1 <= s.length() && s.charAt(i) != s.charAt(i + 1)) {
                    if (!finalString.contains(String.valueOf(s.charAt(i)))) {
                        finalString = finalString + s.charAt(i);
                    } else {
                        finalString = String.valueOf(s.charAt(i));
                    }
                } else if (i + 1 <= s.length() - 1 && s.charAt(i) == s.charAt(i + 1) && !finalString.contains(String.valueOf(s.charAt(i)))) {
                    finalString = String.valueOf(s.charAt(i));
                }
            }
        }

        return numberOfSpaces > 0 ? numberOfSpaces : finalString.length();

    }
}
