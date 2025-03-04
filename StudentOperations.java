 // StudentOperations.java

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperations {
    private ArrayList<Student> studentDatabase = new ArrayList<>(); // List to store student records
    private Scanner sc = new Scanner(System.in); // Scanner for user input

    // Function to add students to the database
    public void addStudent() {
        System.out.print("Enter number of students to add: ");
        int noOfStudent = sc.nextInt();

        for (int i = 0; i < noOfStudent; i++) {
            System.out.print("Enter PRN: ");
            int prn = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
            String dob = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            System.out.print("Enter Position: ");
            int position = sc.nextInt();

            // Create student object and add it to the list
            Student s = new Student(prn, name, marks, dob);
            s.setPosition(position);
            studentDatabase.add(s);

            System.out.println("Student added successfully!\n");
        }
    }

    // Function to display all students
    public void printStudentDetails() {
        System.out.println("\n------ Student List ------");
        System.out.println("PRN\tName\tMarks\tPosition");

        for (Student student : studentDatabase) {
            System.out.println(student.getPrn() + "\t" + student.getName() + "\t" + student.getMarks() + "\t" + student.getPosition());
        }
    }

    // Function to delete a student by PRN
    public boolean deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        int prn = sc.nextInt();

        for (int i = 0; i < studentDatabase.size(); i++) {
            if (studentDatabase.get(i).getPrn() == prn) {
                System.out.println(studentDatabase.get(i).getName() + " removed from the database.");
                studentDatabase.remove(i);
                return true;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
        return false;
    }

    // Function to update student details by PRN
    public void updateByPrn() {
        System.out.print("Enter PRN to update: ");
        int prn = sc.nextInt();

        for (Student student : studentDatabase) {
            if (student.getPrn() == prn) {
                sc.nextLine(); // Consume newline

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();
                student.setName(newName);

                System.out.print("Enter New DOB (dd/mm/yyyy): ");
                String dob = sc.nextLine();
                student.setDob(dob);

                System.out.print("Enter New Marks: ");
                double marks = sc.nextDouble();
                student.setMarks(marks);

                System.out.print("Enter New Position: ");
                int position = sc.nextInt();
                student.setPosition(position);

                System.out.println("Student details updated successfully!");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }
