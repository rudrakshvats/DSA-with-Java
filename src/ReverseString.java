public class ReverseString {
    public static void main(String[] args) {
        String stringToBeReverse = "Reverse";
        String[] array = stringToBeReverse.split("");
        String reverseString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverseString = reverseString + array[i];
        }
        System.out.println("Reverse of " + stringToBeReverse + " is " + reverseString);
    }
}
