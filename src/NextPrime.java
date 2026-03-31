import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        num += 1;
        System.out.print(nextPrime(num));
    }

    private static int nextPrime(int num) {
        while (!checkIsPrime(num)) {
            num += 1;
        }

        return num;
    }

    private static boolean checkIsPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
            }
        }

        return count <= 2;
    }
}
