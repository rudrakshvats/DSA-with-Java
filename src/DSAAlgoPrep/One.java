package DSAAlgoPrep;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("eligible");
        }
        else {
            System.out.println("not eligible");
        }
    }
}
