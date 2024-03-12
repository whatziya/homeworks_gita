package lesson_15;

abstract class Ballar {
    protected int[] marks;

    public final void getPercentage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double percentage = (double) totalMarks / marks.length;
        System.out.println("Foiz: " + percentage);
    }
}