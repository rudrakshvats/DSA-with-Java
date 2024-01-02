package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = n / 2;
        int prints = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            int val = i;
            for (int j = 1; j <= prints; j++) {
                System.out.print(val + "\t");
                if (i < n / 2) {
                    val += 1;
                }
                else {
                    val -= 1;
                }
            }
            if (i <= n / 2) {
                spaces -= 1;
                prints += 2;
            }
            else {
                spaces += 1;
                prints -= 2;
            }
            System.out.print("\n");
        }
    }
}
