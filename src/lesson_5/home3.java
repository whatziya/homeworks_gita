package lesson_5;

import java.util.Arrays;

public class home3 {
        public static void main(String[] args) {
            int[] a = {2,4,8,10};
            int[] b = generateB(a);

            System.out.println(Arrays.toString(b));
        }

        public static int[] generateB(int[] a) {
            int n = a.length;
            int [] b = new int[n];

            for (int k = 0; k < n; k++) {
                int sum = 0;
                for (int i = 0; i <= k; i++) {
                    sum += a[i];
                }
                b[k] = sum / (k + 1);
            }
            return b;
        }

}
