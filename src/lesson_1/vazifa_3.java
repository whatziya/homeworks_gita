package lesson_1;

import java.util.Scanner;

public class vazifa_3 {
    public static void main(String[] args){
        String s = new String();
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        char[] sChar = s.toCharArray();
        int res = 0;
        for(char i : sChar){
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
