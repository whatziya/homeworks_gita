package lesson_5;

public class home1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.print("[");
        for (int i = a; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                if (j < i - 1) {
                    System.out.print(", ");
                }
            }
            if (i < b - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
