package dars8practice;

import javax.sound.midi.Soundbank;

public class Room {
    private int roomCapacity;
    private int currentCount = 0;

    private Student[] students;

    public Room(int roomCapacity) {
        this.roomCapacity = roomCapacity;
        this.students = new Student[roomCapacity];

    }

    public Student[] getStudents() {
        return students;
    }

    void add(Student student){
        if(!isFull()){
            students[currentCount++] = student;
            System.out.println(student.toString());
        } else{
            System.out.println("Room is full");
        }
    }
    boolean isFull(){
        return currentCount >= roomCapacity;
    }
    boolean isEmpty(){
        return currentCount == 0;
    }
}
