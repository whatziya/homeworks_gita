package lesson_16.Students;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private String location;

    List<Student> students;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.students = new ArrayList<>();
    }

    class Student{
        String firstName;
        String lastName;
        int course;

        public Student(String firstName, String lastName, int course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            students.add(this);
        }

        public void showInfo() {
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Course: " + course);
            System.out.println();
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", course=" + course +
                    '}';
        }
    }

}
