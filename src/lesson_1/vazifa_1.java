package lesson_1;

import java.util.Scanner;

public class vazifa_1 {
    public static void main(String[] args){
        String a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        b = scanner.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        System.out.println(a.equals(b) ? "Bir xil" : "Xar xil");
    }
}
