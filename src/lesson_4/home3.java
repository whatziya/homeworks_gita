package lesson_4;

public class home3 {
    public static void main(String[] args) {
        int[] a = {2,1,4,5,8,9};
        int length = a.length;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(a[i] > a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
        }
    }
}
