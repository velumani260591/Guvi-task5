import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringFilter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Print the non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
