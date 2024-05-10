package DSAAlgoPrep;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i <= 2; i++) {
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
