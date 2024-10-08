package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("* \t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}
