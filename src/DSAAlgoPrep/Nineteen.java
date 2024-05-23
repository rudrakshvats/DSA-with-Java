package DSAAlgoPrep;

import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println(false);
            return;
        }
        System.out.println(checkIfNumberIsPerfectSquare(number));
    }

    private static boolean checkIfNumberIsPerfectSquare(Integer number) {
        for (int i = 1; i < number; i++) {
            if (number / i == i) {
                return i * i == number;
            }
        }
        return false;
    }
}
