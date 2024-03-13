package lesson_16.Student;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.TagElement;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int course;
    public Student(String firstName, String lastName, int age, int
            course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }
    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", "Doe", 20, 2));
        students.add(new Student("Alice", "Smith", 21, 3));
        students.add(new Student("Bob", "Johnson", 19, 1));

        return students;
    }

    public void showInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}
