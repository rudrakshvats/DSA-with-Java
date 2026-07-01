package Recursion;

import java.util.Scanner;

public class PrintNumbers1ToN {
    public static void main(String[] args) {
        System.out.print("Enter a number upto which you want to print the numbers: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers1ToN(1, n);
    }

    private static void printNumbers1ToN(int counter, int n) {
        if (n == 0) return;

        System.out.println(counter);

        printNumbers1ToN(counter + 1, n - 1);
    }
}
