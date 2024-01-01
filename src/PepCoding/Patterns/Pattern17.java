package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        System.out.print("Enter an odd number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = n / 2;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            if (i == (n / 2) + 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            }
            else {
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("\t");
                }
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*\t");
                }
            }
            System.out.print("\n");
            if (i <= n / 2) {
                stars += 1;
            }
            else {
                stars -= 1;
            }
        }
    }
}
