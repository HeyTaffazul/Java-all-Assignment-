// Class representing a Student with name, roll number, and grade
class Student {
    // Instance variables
    String name;
    int rollNumber;
    String grade;

    // Constructor to initialize instance variables
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Method to display the details of the student
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

// Class to test the Student class
public class School {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student("Taffazul", 01, "A");

        // Call the displayDetails method to print student details
        System.out.println("Student Details:");
        student.displayDetails();
    }
}
