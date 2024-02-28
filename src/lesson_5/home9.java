package lesson_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class home9 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        for (int i = k; i < a.length-1; i++) {
            a[i] = a[i + 1];
        }
//        umumiy algoritm shu
//        int[] result = new int[a.length - 1];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = a[i];
//        }
//        System.out.println(Arrays.toString(result));
    }
}
