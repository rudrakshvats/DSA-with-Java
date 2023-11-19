package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }
}
