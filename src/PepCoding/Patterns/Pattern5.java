package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to print the pattern: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n / 2; j++) {
                System.out.print("\t");
            }
            for (int j = i; j >= n / 2; j++) {
                System.out.print("\t");
            }
            for (int j = i; j <= (2 * i) - 1; j++) {
                System.out.print("* \t");
            }
            for (int j = i; j >= (2 * i) + 1; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }
}
