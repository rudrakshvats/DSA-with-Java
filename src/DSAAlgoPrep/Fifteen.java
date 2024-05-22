package DSAAlgoPrep;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int numberOfFactors = 0;
        for (int i = 1 ; i <= number; i++) {
            if (number % i == 0) {
                numberOfFactors += 1;
            }
        }
        System.out.println(numberOfFactors);
    }
}
