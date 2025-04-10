import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseConverter {
    public static void main(String[] args) {
        // Stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using map()
        List<String> upperCaseNames = names
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}