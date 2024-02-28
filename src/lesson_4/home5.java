package lesson_4;

public class home5 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int k = 4;
        int l = a.length / k;
        for (int i = 1; i <= l; i++) {
            System.out.print(a[k * i - 1]);
            if(i < l){
                System.out.print(", ");
            }
        }
    }
}
