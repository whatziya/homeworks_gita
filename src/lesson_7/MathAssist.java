package lesson_7;

public class MathAssist {
    int min(int a, int b){
        int i = a > b ? b : a;
        return i;
    }
    int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= c) {
            return b;
        } else {
            return c;
        }
    }

    int min(int[] arr){
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    int swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return 0;
    }
    int swap(double a, double b){
        double temp = a;
        a = b;
        b = temp;
        return 0;
    }

}
