import java.util.Arrays;

public class OneExtraCharacter {

    public static void main(String[] args) {
        oneExtraCharacter("gmnpwakq", "nqkapgw");
    }

    public static Character oneExtraCharacter(String s1, String s2) {
        // Your code here
        String[] strArray = s1.length() > s2.length() ? s2.split("") : s1.split("");
        Arrays.sort(strArray);
        for (String s : strArray) {
            s1 = s1.replaceFirst(s, "");
            s2 = s2.replaceFirst(s, "");
        }

        return s1.isEmpty() ? s2.charAt(0) : s1.charAt(0);
    }
}
