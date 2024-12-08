package Task4_Q3;

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to input the day position
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("The day is: " + weekdays[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle index out-of-bounds exception
            System.err.println("Invalid day index! Please enter a value between 0 and 6.");
        } catch (Exception e) {
            // Handle other exceptions (e.g., input mismatch)
            System.err.println("Invalid input! Please enter a numeric value.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

