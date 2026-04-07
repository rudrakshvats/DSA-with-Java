import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;
        if (n == 0) System.out.print(first);
        else if (n == 1) System.out.print(second);
        else {
            int temp = 0;
            for (int i = 2; i <= n; i++) {
                temp = first + second;
                first = second;
                second = temp;
            }
            System.out.print(temp);
        }


    }
}
