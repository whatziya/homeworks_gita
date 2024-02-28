package lesson_3;

public class home2 {
    public static void main(String[] args) {
        int son = 1001;
        int daraja = 0;
        int res = 0;
        while(son > 0){
            res += (son % 10) * (Math.pow(2, daraja));
            daraja++;
            son /= 10;
        }
        System.out.println(res);
    }
}
