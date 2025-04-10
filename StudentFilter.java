import java.util.*;
import java.util.stream.*;

public class StudentFilter {
    public static void main(String[] args) {
        // 1. List of 10 student names
        List<String> studentNames = Arrays.asList(
                "Alice", "Bob", "Anita", "Charlie", "Andrew",
                "Brian", "Aarav", "Diana", "Arjun", "Eva"
        );

        // 2. Filter names starting with "A" using lambda and Stream API
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // 3. Print the students who will receive special gifts
        System.out.println("Students who will receive special gifts:");
        specialGiftStudents.forEach(System.out::println);
    }
}