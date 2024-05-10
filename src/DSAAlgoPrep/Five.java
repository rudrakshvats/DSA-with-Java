package DSAAlgoPrep;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("divisible");
        }
        else {
            System.out.println("not divisible");
        }
    }
}
