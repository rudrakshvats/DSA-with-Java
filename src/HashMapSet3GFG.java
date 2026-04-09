import java.util.HashMap;

public class HashMapSet3GFG {
    public static void main(String[] args) {
        int n = 4;
        String[] keys = {"csdb", "dsh", "askj", "adfs"};
        int[] arr = {4, 5, 8, 9};
        String s = "dptu";
        System.out.print(map(n, keys, arr, s));
    }

    static int map(int n, String keys[], int arr[], String s) {
        // code here
        // int keyIndex = -1;
        // for (int i = 0; i < keys.length; i++) {
        //     if (keys[i].equals(s)) {
        //         keyIndex = i;
        //         break;
        //     }
        // }
        // if (keyIndex == -1) return -1;
        // return arr[keyIndex];
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(keys[i], arr[i]);
        }
        if (map.containsKey(s)) {
            return map.getOrDefault(s, -1);
        }
        return -1;
    }
}
