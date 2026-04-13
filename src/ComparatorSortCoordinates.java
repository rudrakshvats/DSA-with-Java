import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSortCoordinates {

    public static void main(String[] args) {
        Point[] arr = new Point[5];
        Point p1 = new Point(1, 2);
        arr[0] = p1;
        Point p2 = new Point(3, 4);
        arr[1] = p2;
        Point p3 = new Point(5, 6);
        arr[2] = p3;
        Point p4 = new Point(7, 8);
        arr[3] = p4;
        Point p5 = new Point(9, 0);
        arr[4] = p5;
//        coordinatesSort(arr);
        coordinatesSortWithoutStream(arr);
    }

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return ("(" + this.x + "," + this.y + ") ");
        }
    }

    public static void coordinatesSort(Point[] arr) {
        // Your code here
        Arrays.sort(arr, Comparator.comparingInt((Point p) -> p.x).thenComparing(p -> p.y));
        // Use lambda expressions to sort the array in the required way
        System.out.print(Arrays.toString(arr));
    }

    public static void coordinatesSortWithoutStream(Point[] arr) {
        int internalCounter = 0;
        int n = arr.length;
        while (n > 0) {
            while (internalCounter + 1 < arr.length && internalCounter < arr.length) {
                Point prev = arr[internalCounter];
                Point next = arr[internalCounter + 1];
                if ((prev.x > next.x) || prev.x == next.x && prev.y > next.y) {
                    arr[internalCounter] = next;
                    arr[internalCounter + 1] = prev;
                }
                internalCounter += 1;
            }
            internalCounter = 0;
            n -= 1;
        }

        System.out.print(Arrays.toString(arr));
    }
}
