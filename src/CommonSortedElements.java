import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CommonSortedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        System.out.print("Enter the elements for first array: ");
        for (int i = 0; i < size1; i++) {
            firstArrayList.add(scanner.nextInt());
        }

        ArrayList<Integer> secondArrayList = new ArrayList<>();
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        System.out.print("Enter the elements for second array: ");
        for (int i = 0; i < size2; i++) {
            secondArrayList.add(scanner.nextInt());
        }

        System.out.print("Common elements in sorted order are: " + getCommonElements(firstArrayList, secondArrayList));
    }

    private static ArrayList<Integer> getCommonElements(ArrayList<Integer> firstArrayList, ArrayList<Integer> secondArrayList) {
        ArrayList<Integer> commonElementsArrayList = new ArrayList<>();
        for (Integer i: firstArrayList) {
            if (secondArrayList.contains(i)) {
                commonElementsArrayList.add(i);
            }
        }

        Collections.sort(commonElementsArrayList);
        return commonElementsArrayList;
    }
}
