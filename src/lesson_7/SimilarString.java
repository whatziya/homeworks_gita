package lesson_7;

public class SimilarString {
    char[] chars;
    public SimilarString(char[] chars){
        this.chars = chars;
    }
    public SimilarString(String s){
        this.chars = s.toCharArray();
    }
    boolean equals(char[] mass){
        if (mass.length != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (mass[i] != chars[i]) {
                return false;
            }
        }
        return true;
    }
    boolean equals(char[] mass, boolean ignoreCase){
        if (mass.length != chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            char internalChar = chars[i];
            char providedChar = mass[i];
            if (ignoreCase) {
                internalChar = Character.toLowerCase(internalChar);
                providedChar = Character.toLowerCase(providedChar);
            }
        }
        return true;

    }
    char[] subString(int startIndex){
        char[] res = new char[chars.length - startIndex];
        for (int i = 0; i < res.length; i++) {
            res[i] = chars[i];
        }
        return res;
    }
    char[] subString(int startIndex, int endIndex){
        char[] res = new char[endIndex - startIndex + 1];
        for (int i = startIndex; i < endIndex; i++) {
            res[i] = chars[i];
        }
        return res;
    }
}
