package Java8StreamAPI;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Alice"); // non-null value needs to be passed else it will produce
        // NullPointerException
        System.out.println(name);
        Optional<String> expression = Optional.ofNullable(null); // can pass both null or non-null values
        // irrespective of NPE
        System.out.println(expression);
        System.out.println(expression.isPresent()); // returns true for non-null value else returns false
        String defaultCase = expression.orElse("default"); // if we want to get a default value irrespective optional
        // has null or non-null elements, we can use orElse method to return it
        System.out.println(defaultCase);
        String defaultCase2 = expression.orElseGet(() -> "default"); // we can also use orElseGet but inside the
        // bracket we can pass lambda expression to call a particular method but this method has to have the same
        // return type else it will give Compilation error
    }
}
