package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print the pattern: ");
        int n = new Scanner(System.in).nextInt();
        int first = 0;
        int second = 1;
        int temp = first + second;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print(first + "\t");
                }
                else {
                    System.out.print(temp + "\t");
                    temp = first + second;
                    first = second;
                    second = temp;
                }
            }
            System.out.print("\n");
        }
    }
}
