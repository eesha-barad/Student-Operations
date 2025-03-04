 // Main.java

import java.util.Scanner;

/*
Name: Eesha Barad
PRN: 23070126161
Batch: AIML-B1
*/

public class Main {
    public static void main(String[] args) {
        // Object to handle student-related operations
        StudentOperations studentOperations = new StudentOperations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu-driven loop for user interaction
        do {
            System.out.println("\n------ Student Management System ------");
            System.out.println("1. Add students");
            System.out.println("2. Display students");
            System.out.println("3. Search students by PRN");
            System.out.println("4. Search students by Name");
            System.out.println("5. Search students by Position");
            System.out.println("6. Update students by PRN");
            System.out.println("7. Delete student by PRN");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt(); // Take user input

            // Handle user's choice
            switch (choice) {
                case 1:
                    studentOperations.addStudent();
                    break;
                case 2:
                    studentOperations.printStudentDetails();
                    break;
                case 3:
                    studentOperations.searchByPrn();
                    break;
                case 4:
                    studentOperations.searchByName();
                    break;
                case 5:
                    studentOperations.searchByPosition();
                    break;
                case 6:
                    studentOperations.updateByPrn();
                    break;
                case 7:
                    studentOperations.deleteStudent();
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8); // Loop until the user chooses to exit

        scanner.close(); // Close scanner to avoid memory leaks
    }
}