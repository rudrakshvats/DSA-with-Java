package DSAAlgoPrep;

import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();
        System.out.println(calculateFactorial(number1));
        System.out.println(calculatePermutation(number1, number2));
        System.out.println(calculateCombination(number1, number2));
    }

    private static Integer calculateCombination(Integer number1, Integer number2) {
        return calculateFactorial(number1) / (calculateFactorial(number2) * calculateFactorial(number1 - number2));
    }

    private static Integer calculatePermutation(Integer number1, Integer number2) {
        return calculateFactorial(number1) / (calculateFactorial(number1 - number2));
    }

    private static Integer calculateFactorial(Integer number1) {
        if (number1 > 0) {
            return number1 * calculateFactorial(number1 - 1);
        }
        return 1;
    }
}
