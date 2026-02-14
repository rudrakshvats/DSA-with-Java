import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumeralToInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Roman numeral: ");
        String romanNumeral = scanner.next();
        System.out.println(romanToInteger(romanNumeral));
    }

    // here we will iterate from left to right, we can use a separate method to store values corresponding to each roman character or we can use a map
    // we will check that the value of first character is less than the value of second character, if yes then value of first character will be decremented from result
    // else we will increment it, this process will continue until we reach the second last character as the last character value will always be positive
    private static int romanToInteger(String romanNumber) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            if (i < romanNumber.length() - 1 && map.get(romanNumber.charAt(i)) < map.get(romanNumber.charAt(i + 1))) {
                result -= map.get(romanNumber.charAt(i));
            } else {
                result += map.get(romanNumber.charAt(i));
            }
        }

        return result;
    }
}
