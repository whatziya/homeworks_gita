package lesson_11.LessonAndStudent;

public class Lesson {
    private String lessonName;
    private int time;

    public Lesson(String lessonName, int time) {
        this.lessonName = lessonName;
        this.time = time;
    }

    public String getLessonName() {
        return lessonName;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", time=" + time +
                '}';
    }
}
