public class Student {

    int id;
    String name;
    String Department;
    int javaMark;
    int PythonMark;
    int DatabaseMark;
    int totalMarks;
    double averageMarks;
    String AverageGrade;

    Student(int id, String name, String Department, int javaMark, int PythonMark, int DatabaseMark) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.javaMark = javaMark;
        this.PythonMark = PythonMark;
        this.DatabaseMark = DatabaseMark;

        this.totalMarks = javaMark + PythonMark + DatabaseMark;
        this.averageMarks = totalMarks / 3.0;
        this.AverageGrade = calculateGrade(averageMarks);
    }


        String calculateGrade(double averageGrade){

         String grade;

        if (averageGrade >= 90) {
            grade = "A+";
        } else if (averageGrade >= 80) {
            grade = "A";
        } else if (averageGrade >= 70) {
            grade = "B";
        } else if (averageGrade >= 50) {
            grade = "C";
        } else if (averageGrade >= 35) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;

    }

}