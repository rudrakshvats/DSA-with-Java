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

        // for single digit check
        if (number >= 0 && number < 10) {
            System.out.println("Single digit numbers are already palindrome");
        }

        // for any number which has 0 at one's digit
        if (number % 10 == 0) {
            System.out.println(original + " is not a palindrome number");
        }
        else {
            while (number > 0) {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            }

            if ((original == reverse) || (original == reverse / 10)) {
                // here the first check will be successful for even number of digit and for odd number of digit just divide the number by 10 so that the middle digit of
                // the number which is kind of unrequired is ignored
                System.out.println(original + " is a palindrome number");
            } else {
                System.out.println(original + " is not a palindrome number");
            }
        }
    }
}
