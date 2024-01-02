package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = 0;
        int stars = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < stars) {
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                stars -= 2;
                spaces += 1;
            }
            else {
                stars += 2;
                spaces -= 1;
            }
            System.out.print("\n");
        }
    }
}
