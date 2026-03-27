import java.util.Scanner;

public class PrintPrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String result = "";
        System.out.print("Prime Factorization of " + num + " is: " + printPrimeFactorization(num, result));
    }

    private static String printPrimeFactorization(int num, String result) {
        int counter = 2;
        while (num != 1) {
            if (num % counter == 0) {
                result += counter + " ";
                num = num / counter;
            } else {
                counter += 1;
            }
        }

        return result;
    }
}
