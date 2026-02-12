import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value to replace it: ");
        int x = scanner.nextInt();
        System.out.println("Reverse of " + x + " is : " + reverseInteger(x));
    }

    // the condition to resolve this question is that x should not exceed the range [-2^31, 2^31 - 1] because those are the minimum and maximum amount a 32-bit integer
    // variable can hold
    private static int reverseInteger(int x) {
        if (x == 0) return 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (x == min || x == max) return 0; // if the value is either equal to min i.e. -2^31 or max i.e. 2^31 then on reversing it the value will overflow the range
        // i.e. the value of reverse of -2147483648 is -8463847412 and 2147483647 is 7463847412 (greater value for both cases which causes overflow of 32 bit int variable)
        int reverse = 0;
        while (x != 0) {
            // here we will use the logic of simply dividing our min and max by 10 so that we can understand that irrespective of last digit, is our reverse value less than
            // min or greater than max, if any of the condition is true, just print 0
            // i.e. if the number x = -1563847412 if we reverse it we get -2147483651 which is clearly less than -2147483648, but we will just forget the last digit of both
            // min and x so we get reverse = -214748365 and min = -214748364 so we can see reverse is still less than x so overflow condition maintains, the reason we are
            // dividing by 10 is that once we get to the number -214748365, and then we append the last digit 1 then int variable cannot store it which will definitely
            // break our application, similar is the case for positive integer x
            if (reverse < min / 10) return 0;
            if (reverse > max / 10) return 0;
            reverse = reverse * 10 + (x % 10);
            x = x / 10;
        }

        return reverse;
    }

    // TC: O(log10 x) because we are dividing x by 10 in loop
    // SC: O(1) because we are using three variables only min, max and reverse
}
