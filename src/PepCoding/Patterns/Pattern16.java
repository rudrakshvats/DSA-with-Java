package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = n + 1;
        int prints = 1;
        for (int i = 1; i <= n; i++) {
            int printValue = 1;
            for (int j = 1; j <= prints; j++) {
                System.out.print(printValue + "\t");
                printValue += 1;
            }
            if (spaces < 0) {
                printValue -= 1;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= (spaces > 0 ? prints : prints - 1); j++) {
                printValue -= 1;
                System.out.print(printValue + "\t");
            }
            spaces -= 2;
            prints += 1;
            System.out.print("\n");
        }
    }
}
