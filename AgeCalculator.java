import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = null;

        // Prompt user for birthdate input
        while (birthDate == null) {
            System.out.print("Enter your birthdate (dd/MM/yyyy): ");
            String input = scanner.nextLine();
            try {
                birthDate = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            }
        }

        // Close the scanner
        scanner.close();

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between birthdate and current date
        Period age = Period.between(birthDate, currentDate);

        // Display the age
        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                age.getYears(), age.getMonths(), age.getDays());
    }
}