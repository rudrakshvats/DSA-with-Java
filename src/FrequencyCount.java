import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {9, 1, 9, 1, 9, 1, 0};
        System.out.print(frequencyCount(arr));
    }

    public static ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                Map.Entry<Integer, Integer> entry = map.entrySet().stream().filter(x -> x.getKey() == i).findFirst().get();
                map.replace(i, entry.getValue(), entry.getValue() + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (int i : arr) {
            Optional<Map.Entry<Integer, Integer>> optional = map.entrySet().stream().filter(x -> x.getKey() == i).findFirst();
            if (optional.isPresent()) {
                if (i == optional.get().getKey()) {
                    result.add(optional.get().getValue());
                }
                map.remove(i, optional.get().getValue());
            }
        }

        return result;
    }
}
