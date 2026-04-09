import java.util.ArrayList;

public class MinimumVerticalSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(2);arrayList1.add(3);arrayList1.add(5);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);arrayList2.add(2);
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);arrayList3.add(4);arrayList3.add(5);arrayList3.add(1);
        arr.add(arrayList1);
        arr.add(arrayList2);
        arr.add(arrayList3);
        System.out.print(minimum_vertical_sum(arr));
    }

    // arr = [[2, 3, 5], [1, 2], [1, 4, 5, 1]]
    // 2 + 1 + 1 = 4, 3 + 2 + 4 = 9, 5 + 5 = 10, 1 = 1, so minimum sum is 1
    public static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr) {
        // code here
        // first we will find minimum size array
        if (arr.isEmpty()) return 0;

        int minimumSize = arr.get(0).size();
        int maximumSize = arr.get(0).size();

        for (ArrayList<Integer> arrayList: arr) {
            if (arrayList.size() < minimumSize) {
                minimumSize = arrayList.size();
            }
            if (arrayList.size() > maximumSize) {
                maximumSize = arrayList.size();
            }
        }

        if (minimumSize == 0) return 0;

        int minSum = 0;

        int index = 0;
        int counter = 0;
        while (counter < maximumSize) {
            int minSumInternal = 0;
            for (ArrayList<Integer> arrayList: arr) {
                if (arrayList.size() == minimumSize && index == minimumSize) {
                    minSumInternal += 0;
                }
                else if (arrayList.size() == maximumSize && index == maximumSize) {
                    minSumInternal += 0;
                }
                else if (index < arrayList.size() && null != arrayList.get(index)) {
                    minSumInternal += arrayList.get(index);
                }
            }
            if (minSum == 0 || minSumInternal < minSum) minSum = minSumInternal;
            counter += 1;
            index += 1;
        }

        return minSum;
    }
}
