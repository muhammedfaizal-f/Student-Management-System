
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    static void addstudent(ArrayList<Student> students) {

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Java Mark: ");
        int javaMark = scanner.nextInt();

        System.out.print("Enter Python Mark: ");
        int pythonMark = scanner.nextInt();

        System.out.print("Enter Database Mark: ");
        int databaseMark = scanner.nextInt();

        Student student = new Student(
            studentId,
            name,
            department,
            javaMark,
            pythonMark,
            databaseMark
        );

        students.add(student);

        System.out.println("Student added successfully!");
    }

    static void viewstudent(ArrayList<Student> students) {

        System.out.println("===== Student List =====");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {

            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Department: " + student.Department);
            System.out.println("Java Mark: " + student.javaMark);
            System.out.println("Python Mark: " + student.PythonMark);
            System.out.println("Database Mark: " + student.DatabaseMark);
            System.out.println("Total Marks: " + student.totalMarks);
            System.out.printf("Average Marks:  %.2f%n", student.averageMarks);
            System.out.println("Grade: " + student.AverageGrade);

            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addstudent(students);
                    break;

                case 2:
                    viewstudent(students);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
