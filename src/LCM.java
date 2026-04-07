import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(findLCM(a, b));
    }

    private static int findLCM(int a, int b) {
        int ans = 1;
        int common = 2;
        while (a > 1 || b > 1) {
            if (a % common == 0 && b % common == 0) {
                ans *= common;
                a = a / common;
                b = b / common;
            } else if (a % common == 0) {
                ans *= common;
                a = a / common;
            } else if (b % common == 0){
                ans *= common;
                b = b / common;
            } else {
                common += 1;
            }
        }

        return ans;
    }
}
