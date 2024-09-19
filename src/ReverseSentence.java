public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Hi my name is Rudraksh";
        String[] words = sentence.split(" ");
        String reverseSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentence = reverseSentence + " " + words[i];
        }
        System.out.println("Reverse of " + sentence + " is \n" + reverseSentence);
    }
}
