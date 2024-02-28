package lesson_5;

import java.util.Arrays;

public class home8 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] < 5 ? 2 * a[i] : a[i] / 2;
        }
        System.out.println(Arrays.toString(b));
    }
}
