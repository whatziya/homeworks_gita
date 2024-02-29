package lesson_7;

public class home2 {
    public static int reverseInteger(int n){
        int nc = Math.abs(n);
        boolean isNegative = n != Math.abs(n);
        int sum = 0;
        while (nc > 0) {
            sum = sum * 10 + nc % 10;
            nc /= 10;
        }
        return isNegative ? -sum : sum;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(-123));
    }
}
