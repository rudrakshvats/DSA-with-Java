import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ElectedCandidate {
    public static void main(String[] args) {
        String[] arr = {"Shrikant", "Sushma", "Rajnath", "Sushma"};
        System.out.print(getElectedCandidateName(arr));
    }

    private static String getElectedCandidateName(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str: arr) {
            if (map.containsKey(str)) {
                Map.Entry<String, Integer> entry = map.entrySet().stream().filter(x ->
                        x.getKey().equals(str)).findFirst().get();
                map.replace(str, entry.getValue(), entry.getValue() + 1);
            } else {
                map.put(str, 1);
            }
        }

        Optional<Integer> optional = map.values().stream().max(Integer::compareTo);

        int maxVoteCount;
        maxVoteCount = optional.orElse(1);

        Map.Entry<String, Integer> entry = map.entrySet().stream().filter(x -> x.getValue() == maxVoteCount).findFirst().get();

        return entry.getKey();
    }
}
