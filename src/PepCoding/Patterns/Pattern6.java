package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print the pattern: ");
        int n = scanner.nextInt();
        int spaces = 1;
        int stars = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("* \t");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = spaces + stars; j <= n + 1; j++) {
                System.out.print("* \t");
            }
            if (i <= n / 2) {
                spaces += 2;
                stars -= 1;
            }
            else {
                spaces -= 2;
                stars += 1;
            }
            System.out.print("\n");
        }
    }
}
