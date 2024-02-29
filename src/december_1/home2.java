package december_1;

public class home2 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5};
        int count = 0;
        for(int i : a){
            if(i % 2 == 0){
                count ++;
            }
        }
        System.out.println(count    );
    }
}
