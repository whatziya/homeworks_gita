package lesson_4;

import java.util.Arrays;

public class home10 {
    public static void main(String[] args) {
        int[] a = {10,3,4,3,45,8,10,3};
        Arrays.sort(a);
        int unique = 1;
        for (int i = 1; i < a.length; i++) {
            if(a[i] != a[i - 1]) unique++;
        }
        int[] res = new int[unique];
        res[0] = a[0];
        int index = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                res[index++] = a[i];
            }
        }
        System.out.println(Arrays.toString(res));


    }
}
