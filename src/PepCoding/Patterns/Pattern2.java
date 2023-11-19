package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }
}
