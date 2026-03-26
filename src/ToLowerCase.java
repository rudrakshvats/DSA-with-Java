import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(convertToLowerCase(input));
    }

    private static String convertToLowerCase(String input) {
        String result = "";
        for (char c: input.toCharArray()) {
            result += (String.valueOf(c)).toLowerCase();
        }

        return result;
    }
}
