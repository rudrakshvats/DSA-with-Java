import java.util.ArrayList;

public class MaxNeighbour {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.print(maxNeighbour(arr));
    }

    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // Your code here
        int max;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i + 1 < arr.size()) {
                max = Math.max(arr.get(i), arr.get(i + 1));
                arrayList.add(max);
            }
        }

        return arrayList;
    }
}
