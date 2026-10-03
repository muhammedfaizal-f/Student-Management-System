import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagementSystem {

     static Scanner scanner = new Scanner(System.in);
     static ArrayList<Student> students = new ArrayList<>();
    static void addstudent(ArrayList<Student> students){

         System.out.print("Enter Student ID: ");
        int student = scanner.nextInt();
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
        

        int totalmarks = javaMark + pythonMark + databaseMark;
        double TotalMarks = totalmarks/3.0; 

        int percentage = (totalmarks * 100) / 300;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 35) {
            grade = "D";
        } else {
            grade = "F";
        }

        students.add(new Student(student, name, department, javaMark, pythonMark, databaseMark));
    }
 
    static void viewstudent() {
   
        System.out.println("===== Student List =====");
        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Department: " + student.Department);
            System.out.println("Java Mark: " + student.javaMark);
            System.out.println("Python Mark: " + student.PythonMark);
            System.out.println("Database Mark: " + student.DatabaseMark);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

     

        while (true) {

    System.out.println("===== Student Management System =====");
    System.out.println("1. Add Student");
    System.out.println("2. View Student");
    System.out.println("3. Exit");

    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {

        case 1:
            addstudent(students);
            break;

        case 2:
            viewstudent();
            break;

        case 3:
            System.out.println("Exiting...");
            break;

        default:
            System.out.println("Invalid choice");
    }

    if (choice == 3) {
        break;
    }
}
       
       

    }
}