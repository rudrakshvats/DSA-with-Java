import java.util.Scanner;

public class FindOneExtraCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String[] s1Array = s1.split("");
        for (String s: s1Array) {
            s2 = s2.replaceFirst(s, "");
        }

        System.out.print(s2.charAt(0));
    }
}
