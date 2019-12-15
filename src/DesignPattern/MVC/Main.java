package DesignPattern.MVC;

public class Main {
    public static void main(String[] args) {
        Student student = getStudentDetailFromDatabase();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student,studentView);
        studentController.printStudent();

    }

    private static Student getStudentDetailFromDatabase() {
        Student student = new Student();
        student.setId(1);
        student.setName("shant");
        return student;
    }
}
