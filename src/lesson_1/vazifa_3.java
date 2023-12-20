package lesson_1;

import java.util.Scanner;

public class vazifa_3 {
    public static void main(String[] args){
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        char[] strChar = str.toCharArray();
        int res = 0;
        for(char i : strChar){
            if(isVowel(i)){
                res++;
            }
        }
        System.out.println(res);
    }
    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
}
