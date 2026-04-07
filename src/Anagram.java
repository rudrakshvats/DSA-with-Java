import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.print(areAnagram(s1, s2));
    }

    static int areAnagram(String S1, String S2) {
        // code here
        for (String s: S1.split("")) {
            if (S2.contains(s)) {
                S2 = S2.replaceFirst(s, "");
            }
        }

        return S2.isEmpty() ? 1 : 0;
    }
}
