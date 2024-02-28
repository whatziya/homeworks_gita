package lesson_4;

import java.util.Arrays;

public class home4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        int k = 2;
        int q = a[k - 1];
        for (int i = 0; i < a.length; i++) {
            a[i] += q;
        }
        System.out.println(Arrays.toString(a));
    }
}
