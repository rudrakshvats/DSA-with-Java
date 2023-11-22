package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to print the pattern: ");
        int n = scanner.nextInt();
        int spaces = n / 2; // for this type of pattern we will notice that the first row always contain n/2 spaces and 1 star
        int stars = 1;
        /*
        in this pattern the spaces decrease one by one till we reach n/2 + 1 value and
        stars increase by 2 till we reach n/2 + 1 and as we move from n/2 + 1 to n,
        spaces increase one by one and stars decrease by 2.
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* \t");
            }
            if (i <= n / 2) {
                spaces -= 1;
                stars += 2;
            }
            else {
                spaces += 1;
                stars -= 2;
            }
            System.out.print("\n");
        }
    }
}
