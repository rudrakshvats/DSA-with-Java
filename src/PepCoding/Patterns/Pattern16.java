package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = 2 * n - 3;
        int prints = 1;
        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= prints; j++) {
                System.out.print(value + "\t");
                value += 1;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                prints -= 1;
                value -= 1;
            }
            for (int j = 1; j <= prints; j++) {
                value -= 1;
                System.out.print(value + "\t");
            }
            System.out.print("\n");

            spaces -= 2;
            prints += 1;
        }
    }
}
