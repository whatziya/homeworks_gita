package lesson_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> futbol = new ArrayList<>();
        System.out.println("Futbol o'ynaydigan o'quvchilarni kiriting: ");
        while (sc.hasNext()) {
            String student = sc.next();
            if (student.equals("end")) {
                break;
            }
            futbol.add(student);
        }
        List<String> commoners = new ArrayList<>(futbol);

        List<String> tennis = new ArrayList<>();
        System.out.println("Tennis o'ynaydigan o'quvchilarni kiriting: ");
        while (sc.hasNext()) {
            String student = sc.next();
            if (student.equals("end")) {
                break;
            }
            tennis.add(student);
        }
        commoners.retainAll(tennis);
        futbol.removeAll(commoners);
        tennis.removeAll(commoners);
        System.out.println("Umumiy o'quvchilar soni: " + (futbol.size() + tennis.size() + commoners.size()));
        System.out.println("Faqat futbolistlar: " + futbol);
    }

}
