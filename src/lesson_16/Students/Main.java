package lesson_16.Students;

public class Main {
    public static void main(String[] args) {
        // Create an instance of University
        University university = new University("Example University", "Example Location");

        // Create instances of Student and associate them with the University
        University.Student student1 = university.new Student("John", "Doe", 2);
        University.Student student2 = university.new Student("Alice", "Smith", 3);

        // Call methods on Student objects to show information
        student1.showInfo();
        student2.showInfo();
        System.out.println(university.students);
    }
}
