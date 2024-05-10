package DSAAlgoPrep;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 10 == 0) {
            String numberString = String.valueOf(number);
            String[] array = numberString.split("");
            StringBuilder reverseString = new StringBuilder();
            if (number >= 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    reverseString.append(array[i]);
                }
            }
            else {
                reverseString.append("-");
                for (int i = array.length - 1; i >= 1; i--) {
                    reverseString.append(array[i]);
                }
            }
            System.out.println(reverseString);
        }
        else {
            int reverse = 0;
            while (number % 10 != 0) {
                reverse = reverse * 10 + number % 10;
                number = number / 10;
            }
            System.out.println(reverse);
        }
    }
}
