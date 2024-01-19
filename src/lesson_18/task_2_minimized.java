package lesson_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2_minimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> futbol = readStudents("Futbol o'ynaydigan o'quvchilarni kiriting:", sc);
        List<String> tennis = readStudents("Tennis o'ynaydigan o'quvchilarni kiriting:", sc);

        List<String> commoners = new ArrayList<>(futbol);
        commoners.retainAll(tennis);

        futbol.removeAll(commoners);
        tennis.removeAll(commoners);

        System.out.println("Umumiy o'quvchilar soni: " + (futbol.size() + tennis.size() + commoners.size()));
        System.out.println("Faqat futbolistlar: " + futbol);
    }

    private static List<String> readStudents(String message, Scanner sc) {
        List<String> students = new ArrayList<>();
        System.out.println(message);
        while (sc.hasNext()) {
            String student = sc.next();
            if (student.equals("end")) {
                break;
            }
            students.add(student);
        }
        return students;
    }
}
