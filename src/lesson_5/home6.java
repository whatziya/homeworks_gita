package lesson_5;

public class home6 {
    public static void main(String[] args) {
        int[] a = {10,3,9,4,5,6,2};
        int last = a[a.length - 1];
        boolean found = false;
        for(int i : a){
            if(i < last){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(0);
        }
    }
}
