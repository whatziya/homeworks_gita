package lesson_3;

public class home4 {
    public static void main(String[] args) {
        String input = "Hello world f";
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (currentChar == ' ') {
                inWord = false;
            }
        }
        System.out.println(count);
    }
}
