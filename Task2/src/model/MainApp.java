package model;

import model.Student;
import service.StudentService;

public class MainApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        // Create and save students
        Student s1 = new Student("S001", "Alice");
        Student s2 = new Student("S002", "Bob");

        service.save(s1);
        service.save(s2);

        // Print via service
        service.printAll();
    }
}
