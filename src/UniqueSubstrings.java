import java.util.HashSet;

public class UniqueSubstrings {
    public static void main(String[] args) {
        System.out.print(getUniqueSubstrings("jaja"));
    }

    private static int getUniqueSubstrings(String s) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add(s);
        for (int i = 0; i < s.length(); i++) {
            int endIndex = i;
            while (endIndex <= s.length()) {
                String subString;
                subString = s.substring(i, endIndex);
                if (!subString.isEmpty() && !stringHashSet.contains(subString)) {
                    stringHashSet.add(subString);
                }
                endIndex += 1;
            }
        }

        return stringHashSet.size();
    }
}
