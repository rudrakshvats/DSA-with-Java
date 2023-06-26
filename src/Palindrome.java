import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is palindrome or not: ");
        Integer number = scanner.nextInt();
        checkIsNumberPalindrome(number);
    }

    private static void checkIsNumberPalindrome(Integer number) {
        int original = number;
        int reverse = 0;
        if (number > 0 && number < 10) {
            System.out.println("Single digit numbers are already palindrome");
        }
        while (number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome number");
        }
        else {
            System.out.println(original + " is not a palindrome number");
        }
    }
}
