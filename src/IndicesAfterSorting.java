import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class IndicesAfterSorting {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 2, 5};

        System.out.print("[");
        sortedWithIndices(arr).forEach(x -> {
            System.out.print("[" + x.item + "," + x.index + "]");
        });
        System.out.print("]");
    }

    static class ArrItem
    {
        public int item;
        public int index;

        public ArrItem(int item,int index)
        {
            this.item=item;
            this.index=index;
        }
    }

    public static ArrayList<ArrItem> sortedWithIndices(int arr[]) {
        // Your code here
        int[] unsorted = new int[arr.length];
        System.arraycopy(arr, 0, unsorted, 0, arr.length);
        Arrays.sort(arr);
        ArrayList<ArrItem> arrayList = new ArrayList<>();
        for (int i: arr) {
            ArrItem arrItem = new ArrItem(i, -1);
            arrayList.add(arrItem);
        }

        for (int i = 0; i < unsorted.length; i++) {
            int finalI = i;
            Optional<ArrItem> optionalArrItem = arrayList.stream().filter((x) -> x.item == unsorted[finalI] && x.index == -1).findFirst();
            if (optionalArrItem.isPresent()) {
                ArrItem arrItem = optionalArrItem.get();
                arrItem.index = finalI;
            }
        }
        // Create an array of ArrItem objects and sort by item field

        return arrayList;
    }
}
