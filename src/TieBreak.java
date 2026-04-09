import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TieBreak {
    public static void main(String[] args) {
        String[] arr = {"Turin", "Nick", "Turin", "Nick"};
        System.out.println(TieBreak(arr));
    }

    public static String TieBreak(String[] arr) {
        // Your code here
        Arrays.sort(arr);
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String str: arr) {
            if (map.containsKey(str)) {
                Integer previousValue = map.get(str);
                map.replace(str, previousValue, previousValue + 1);
            } else {
                map.put(str, 1);
            }
        }

        Integer maxValue = 0;
        for (Integer value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), maxValue)) {
                return entry.getKey();
            }
        }

        return null;
    }
}
