import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AreaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice 1 or 2: ");
        int choice = scanner.nextInt();
        List<Double> values = new ArrayList<>();
        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                values.add(radius);
                calculateArea(choice, values);
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = scanner.nextDouble();
                values.add(length);values.add(breadth);
                calculateArea(choice, values);
                break;
        }
    }

    private static void calculateArea(int choice, List<Double> values) {
        if (!values.isEmpty()) {
            Double first = values.stream().findFirst().get();
            if (1 == choice) {
                System.out.print("Area of circle: " + Math.PI * first * first);
            } else {
                values.remove(first);
                Double breadth = values.stream().findFirst().get();
                System.out.print("Area of rectangle: " + first * breadth);
            }
        }
    }
}
