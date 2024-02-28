package lesson_4;

public class home1 {
    public static void main(String[] args) {
        int[] a = {1,2,0,52,3,4,5};
        int min = a[0];
        int max = a[0];
        for(int i: a){
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println(max + " " + min);
    }
}
