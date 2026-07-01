package Recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of first " + n + " numbers is " + sumOfNNumbersUsingRecusrion(n));
    }

    private static int sumOfNNumbersUsingRecusrion(int n) {
        if (n == 0) return 0;

        return sumOfNNumbersUsingRecusrion(n - 1) + n;
    }
}
