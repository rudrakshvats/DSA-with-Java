package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " is: " + findFactorialUsingRecusrion(n));
    }

    private static int findFactorialUsingRecusrion(int n) {
        if (n == 1) return 1;

        return findFactorialUsingRecusrion(n - 1) * n;
    }
}
