 // Student.java
public class Student {

    // Private attributes of the Student class
    private int prn;
    private String name;
    private String dob; 
    private double marks;
    private int position; 
    // Constructor with only PRN
    public Student(int prn) {
        this.prn = prn;
    }

    // Constructor with PRN and name
    public Student(int prn, String name) {
        this(prn); // Calls the constructor with PRN
        this.name = name;
    }

    // Constructor with PRN, name, and marks
    public Student(int prn, String name, double marks) {
        this(prn, name); // Calls the constructor with PRN and name
        this.marks = marks;
    }

    // Constructor with PRN, name, marks, and date of birth
    public Student(int prn, String name, double marks, String dob) {
        this(prn, name, marks); // Calls the constructor with PRN, name, and marks
        this.dob = dob;
    }