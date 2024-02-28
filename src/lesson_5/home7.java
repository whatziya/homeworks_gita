package lesson_5;

public class home7 {
    public static void main(String[] args) {
        int[] a = {1,6,3,4,5,6,7,8};
        int min = a[1];
        for (int i = 3; i < a.length; i += 2) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
