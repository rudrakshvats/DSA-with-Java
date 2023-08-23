import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate its factorial: ");
        Integer number = scanner.nextInt();
        System.out.println("The factorial for " + number + " = " + iterativeFactorial(number));
    }

    private static Integer iterativeFactorial(Integer number) {
        if (number == 0) {
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
