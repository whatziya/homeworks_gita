package lesson_5;

public class Assistant {
    int addTwoNumber(int a, int b){
        return a + b;
    }
    int pow(int a, int b){
        int res = 1;
        for(int i = 0; i < b; i++){
            res *= a;
        }
        return res;
    }
    int abs(int a){
        return a > 0 ? a : -a;
    }
    int getWholeSection(double a) {
        int wholePart = (int) a;

        if (a >= 0) {
            if (a - wholePart >= 0.5) {
                return wholePart + 1;
            } else {
                return wholePart;
            }
        } else {
            if (a - wholePart <= -0.5) {
                return wholePart - 1;
            } else {
                return wholePart;
            }
        }
    }

}
