package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int spaces = n / 2;
        int prints = 1;
        int value = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            int printValue = value;
            for (int j = 1; j <= prints; j++) {
                System.out.print(printValue + "\t");
                if (j <= prints / 2) {
                    printValue += 1;
                }
                else {
                    printValue -= 1;
                }
            }
            if (i <= n / 2) {
                spaces -= 1;
                prints += 2;
                value += 1;
            }
            else {
                spaces += 1;
                prints -= 2;
                value -= 1;
            }
            System.out.print("\n");
        }
    }
}
