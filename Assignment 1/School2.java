// Class representing a Student with private instance variables and public getter methods
class Student {
    // Private instance variables
    private String name;
    private int rollNumber;
    private String grade;

    // Constructor to initialize instance variables
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Public getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    // Modified displayDetails method using getter methods
    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Grade: " + getGrade());
    }
}

// Class to test the Student class with private instance variables
public class School2 {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("Taffazul Ansari", 02, "B");

        // Attempt to access private variables directly (this will not compile)
        // System.out.println(student.name); // Uncommenting this line will cause a compilation error

        // Access details using getter methods
        System.out.println("Accessing Details Using Getter Methods:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Grade: " + student.getGrade());

        // Call the displayDetails method to print student details
        System.out.println("\nUsing displayDetails Method:");
        student.displayDetails();
    }
}
