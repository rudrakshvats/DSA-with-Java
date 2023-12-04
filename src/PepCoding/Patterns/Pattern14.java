package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        System.out.print("Enter a number to print its table: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
