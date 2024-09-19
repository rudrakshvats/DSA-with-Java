public class ReverseString {
    public static void main(String[] args) {
        String stringToBeReverse = "Reverse";
        String reverseString = "";
        for (int i = stringToBeReverse.length() - 1; i >= 0; i--) {
            reverseString = reverseString + stringToBeReverse.charAt(i);
        }
        System.out.println("Reverse of " + stringToBeReverse + " is " + reverseString);
    }
}
