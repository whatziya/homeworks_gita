package lesson_1;

import java.util.Scanner;

public class vazifa_2 {
    public static void main(String[] args){

        String a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        b = scanner.nextLine();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        for(int i = 0; i < aChar.length; i++){
            if(isVowel(aChar[i])){
                aChar[i] = ' ';
            }
        }
        for(int i = 0; i < bChar.length; i++){
            if(isVowel(bChar[i])){
                bChar[i] = ' ';
            }
        }
        a = new String(aChar);
        b = new String(bChar);
        a = a.toLowerCase().replaceAll("\\s", "");;
        b = b.toLowerCase().replaceAll("\\s", "");;
        System.out.println(a.equals(b));


    }public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

}
