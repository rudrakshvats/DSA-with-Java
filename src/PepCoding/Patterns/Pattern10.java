package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main (String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int outerSpaces = n / 2;
        int innerSpaces = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outerSpaces; j++) {
                System.out.print("\t");
            }
            System.out.print("* \t");
            for (int j = 1; j <= innerSpaces; j++) {
                System.out.print("\t");
            }
            if (innerSpaces > 0) {
                System.out.print("*");
            }
            if (i <= (n / 2)) {
                outerSpaces -= 1;
                innerSpaces += 2;
            }
            else {
                outerSpaces += 1;
                innerSpaces -= 2;
            }
            System.out.print("\n");
        }
    }
}
