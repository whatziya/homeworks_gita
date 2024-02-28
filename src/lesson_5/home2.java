package lesson_5;

public class home2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int len = a.length;
        for (int i = len; i > 0; i--) {
            if(a[i - 1] % 2 == 0){
                System.out.print(a[i - 1]);
                if (i > 2) {
                    System.out.print(", ");
                }
            }
        }
    }
}
