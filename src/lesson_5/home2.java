package lesson_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class home2 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,10,13};
        System.out.println(Arrays.toString(tub(arr)));
    }
    public static int[] tub(int[] nums){
        int[] res = new int[nums.length];
        int index = 0;
        first:
        for(int i : nums){
            boolean resb = true;
            for(int j = 2; j <= i / 2; j++){
                if(i % j == 0) {
                    resb = false;
                    break;
                }
            }
            if(resb){
                res[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(res, index);
    }
}
