package lesson_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class home1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;

        for(int i = 0; i < n; i++) {
            System.out.print(2 * a[i]);


            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}
