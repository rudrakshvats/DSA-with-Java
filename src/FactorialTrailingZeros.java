import java.util.Scanner;

public class FactorialTrailingZeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to check number of trailing zeros in its factorial: ");
        int n = scanner.nextInt();
        System.out.println(getTrailingZerosInFactorialEfficient(n));
    }

    private static int getTrailingZerosInFactorialEfficient(int n) {
        if (n == 0) return 0;
        // here we will use a trick that for any number the number of 5's in its factorial
        // determine the trailing of zeros in its factorial but for conditions where we get multiple 5's
        // we simply add that 5 to the answer, explanation is below
        int result = 0;
        while (n > 0) { // number has to be greater than 0
            n = n / 5; // first simply divide number n by 5
            result += n; // if the number is dividing by 5 then we can append result value
        }
        // run this loop until number n is 0

        return result;
    }
}
