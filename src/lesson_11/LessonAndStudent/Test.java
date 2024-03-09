package lesson_11.LessonAndStudent;

public class Test {
    public static void main(String[] args) {
        Limit limit = new Limit(20);
        Student student = new Student("Aziza", 20, limit);
        Lesson lesson = new Lesson("Dasturlash", 3);
        System.out.println(student.addLesson(lesson));
        System.out.println(student.isFullLesson());
        student.getLesson();
        student.getInfo();
        System.out.println(student.getLimit());

    }
}
