package DSAAlgoPrep;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        System.out.println(getSquareRoot(number));
    }

    private static Integer getSquareRoot(Integer number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            if (number / i == i) {
                return i;
            }
        }
        return getSquareRoot(number - 1);
    }
}
