import java.util.Scanner;

public class FindPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        System.out.print(findPattern(s, p));
    }

    private static int findPattern(String s, String p) {
        if (s.contains(p)) {
            char firstOfP = p.charAt(0);
            return s.indexOf(firstOfP);
        }
        return -1;
    }
}
