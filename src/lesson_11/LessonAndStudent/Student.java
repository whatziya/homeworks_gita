package lesson_11.LessonAndStudent;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private Limit timeLimit;
    private int maxLimit;

    private List<Lesson> lessonList;
    public Student(String name, int age, Limit timeLimit){
        this.name = name;
        this.age = age;
        this.timeLimit = timeLimit;
        this.lessonList = new ArrayList<>();
        this.maxLimit = timeLimit.getTimeLimit();
    }
    public boolean addLesson(Lesson lesson){
        if(lessonList.contains(lesson)){
            return false;
        }
        if(timeLimit.getTimeLimit() < lesson.getTime()){
            return false;
        }
        lessonList.add(lesson);
        timeLimit.setTimeLimit(timeLimit.getTimeLimit() - lesson.getTime());
        return true;
    }
    public boolean isFullLesson(){
        return timeLimit.getTimeLimit() == 0;
    }
    public void getLesson(){
        for (Lesson lesson : lessonList) {
            System.out.println(lesson);
        }
    }
    public int getLimit(){
        return timeLimit.getTimeLimit();
    }


    public void getInfo(){
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Limit: " + timeLimit.getTimeLimit() + "/" + getMaxLimit());
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Limit getTimeLimit() {
        return timeLimit;
    }

    public int getMaxLimit() {
        return maxLimit;
    }
}
