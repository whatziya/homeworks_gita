package lesson_5;

public class MathAssistant {
    int number;

    int pow(int degree){
        return (int) Math.pow(number, degree);
    }
    int summDigitsNumber(){
        int sam = number;
        int sum = 0;
        while(sam > 0){
            sum +=sam % 10;
            sam /= 10;
        }
        return sum;
    }
}
