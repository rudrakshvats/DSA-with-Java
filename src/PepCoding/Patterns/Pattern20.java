package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }
    }
}
