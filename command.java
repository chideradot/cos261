import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesApp {

    private static HashMap<String, Double> studentGrades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> viewGrades();
                case 4 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    private static void printMenu() {
        System.out.println("\n--- Student Grades Management ---");
        System.out.println("1. Add Student Grade");
        System.out.println("2. Update Student Grade");
        System.out.println("3. View All Grades");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Use update option.");
            return;
        }
        System.out.print("Enter grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        studentGrades.put(name, grade);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent() {
        System.out.print("Enter student name to update: ");
        String name = scanner.nextLine();
        if (!studentGrades.containsKey(name)) {
            System.out.println("Student not found.");
            return;
        }
        System.out.print("Enter new grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        studentGrades.put(name, grade);
        System.out.println("Student grade updated successfully.");
    }

    private static void viewGrades() {
        if (studentGrades.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student Grades ---");
            studentGrades.forEach((name, grade) -> 
                System.out.println("Student: " + name + ", Grade: " + grade));
        }
    }
}
