import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        GCD gcd = new GCD();
        System.out.print(gcd.computeGCD(a, b));
    }

    public int computeGCD(int a, int b) {
        // code here
        int max = 1;
        int n = Math.max(a, b);
        for (int i = max; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }

        return max;
    }
}
