package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        System.out.print("Enter an odd number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j<= n; j++) {
                    if (j <= (n / 2) + 1 || j == n){
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            else if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (j == (n / 2) + 1 || j == n) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            else if (i <= (n / 2) + 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            }
            else if (i >= n / 2 && i < n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == (n / 2) + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j >= (n / 2) + 1) {
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
