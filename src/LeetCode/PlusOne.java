package LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }
        int n = digits.length;
        boolean allzero = true;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                allzero = false;
                break;
            }
        }
        if (allzero) {
            int ans[] = new int[n + 1];
            ans[0] = 1;
            return ans;
        }

        return digits;
    }
}
