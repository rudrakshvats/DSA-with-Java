import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate its factorial: ");
        Integer number = scanner.nextInt();
        System.out.println("The factorial for " + number + " = " + iterativeFactorial(number));
    }

    /**
     * For iterative factorial technique, we will simply return 1 if number is 0 or take a variable like factorial and
     * assign its initial value to 1 because 0 if never an answer for factorial. Once we have assigned the value, we
     * will iterate a loop from 1 to the number itself as the factorial of number is number times as well and increment
     * the number until it is less than or equal to number itself. Within this loop we will multiply the variable
     * factorial to the traversal integer. Thus, in the end the factorial is the answer.
     * @param number
     * @return
     */
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
