import java.math.BigInteger;

public class NthFibonacciUsingBigInteger {
    public static void main(String[] args) {
        System.out.print(getNthFibonacci(6));
    }

    private static BigInteger getNthFibonacci(int num) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 2; i <= num; i++) {
            result = first.add(second);
            first = second;
            second = result;
        }

        return result;
    }
}
