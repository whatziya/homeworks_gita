import java.util.ArrayList;
import java.util.Scanner;
import java.util.List ;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> navbatchi = new ArrayList<>();

        System.out.println("Navbatchi o'quvchilarni ro'yhatini kiriting:");
        while (scanner.hasNext()) {
            String student = scanner.next();
            if (student.equals("end")) {
                break;
            }
            navbatchi.add(student);
        }

        List <String> guruhdagiOquvchilar = new ArrayList<>();

        System.out.println("Guruhdagi darsga kelgan o'quvchilarni ro'yhatini kiriting:");
        while (scanner.hasNext()) {
            String student = scanner.next();
            if (student.equals("end")) {
                break;
            }
            guruhdagiOquvchilar.add(student);
        }


        List<String> kelmaganNavbatchilar  = new ArrayList<>(navbatchi);
        kelmaganNavbatchilar.removeAll(guruhdagiOquvchilar);

        System.out.println("Darsga kelmagan navbatchi o'quvchilar ro'yhati:");
        for (String student : kelmaganNavbatchilar) {
            System.out.println(student);
        }
    }
}