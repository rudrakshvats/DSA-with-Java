import java.util.Scanner;

public class JavaInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double decimalNumber = scanner.nextDouble();
        String someString = scanner.nextLine();
        System.out.println("\nString: " + someString);
        System.out.println("Double: " + decimalNumber);
        System.out.println("Int: " + number);
    }
}
