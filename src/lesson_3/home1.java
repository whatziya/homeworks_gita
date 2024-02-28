package lesson_3;

public class home1 {
    public static void main(String[] args) {
        int first = 100;
        int second = 200;
        int div = 9;
        int res_c = 0;
        int res = 0;
        for (int i = first; i <= second; i++){
            if(i%9 == 0){
                res_c++;
                res+=i;
            }
        }
        System.out.println(res_c + " ta shunday son bor" + res + " sonlarning yig'indisi");
    }
}
