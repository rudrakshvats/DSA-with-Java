import java.util.Scanner;

public class PowerXN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: " + " \n");
        float x = scanner.nextFloat();
        System.out.print("Enter the power of number to calculate: " + " \n");
        int n = scanner.nextInt();
        System.out.print("Answer of " + x + " to the power of " + n + " = " + powerXN(x, n));
    }

    // not efficient
    private static float powerXN(float x, int n) {
        if (n == 0) return 1;
        if (x == 1) return 1;
        int minPow = Integer.MIN_VALUE;
        int maxPow = Integer.MAX_VALUE;
        if (n < minPow / 10) return 0f;
        if (n > maxPow / 10) return 0f;
        float result = 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        while (n > 0) {
            result = result * x;
            n -= 1;
        }

        return result;
    }
    // TC : O(n) (running loop on n)
    // SC : O(1)


    // for efficient algorithm we will use the concept of x^ab = (x ^ a) ^ b
    // lets take an example: if we want to calculate 2 ^ 10
    // check if num = 10 is not equal to 0, if yes then follow below steps, if equal then return result = 1
    // Step 1 : num = 10 is divisible by 2, now we multiply x by x, x = 2 * 2 = 4 and divide num by 2 = 10 / 2 = 5
    // Step 2 : num = 5 is not divisible by 2 so, result = result * x = 1 * 4 = 4 and num will be decremented by 1 so num = 5 - 1 = 4
    // Step 3 : num = 4 is divisible by 2, now x = x * x = 4 * 4 = 16 and divide num by 2 = 4 / 2 = 2
    // Step 4 : num = 2 is divisible by 2, now x = x * x = 16 * 16 = 256 and divide num by 2 = 2 / 2 = 1
    // Step 5 : num = 1 is not divisible by 2 so, result = result * x = 4 * 256 = 1024 and num will be decremented by so num  = 1 - 1 = 0
    // now since num = 0, we can simply return result value
    private static double powerXNEfficient(float x, int n) {
        // since we can get overflow condition on n because -2^31 <= n <= 2^31 - 1, so we will type cast n to long and then catch its absolute value using Math.abs() method
        // and use it in a long variable
        long num  = Math.abs((long) n);
        double result = 1d;
        // we will run a loop on n until it is not equal to 0
        while (num != 0) {
            // if n is an odd number then simply multiply result by x
            if (num % 2 == 1) {
                result = result * x;
                // once we have multiplies result by x, we will decrement num value by 1
                num -= 1;
            }
            // now at this stage it is guaranteed that num is even, so we will just multiply x by x because num being even makes num equal to 2 as well i.e.
            // num = 16 => num = 2 * 8 as well so 2 here can be treated to just multiply x by x
            x = x * x;
            // now since we encounter num = 2 * 8 => we see that 16 gets divided by 2 to get 2 * 8 so num should also get divided by 2 simultaneously
            num = num / 2;
        }

        // now if we get a test case where n is -ve, then we know by Mathematics that x^-n can also be written as 1/(x^n), so simply write the result as below
        return n < 0 ? 1d / result : result;
    }

    // TC : O(log2n) // since we are dividing n by 2
    // SC : O(1) // since we are using just one variable result
}
