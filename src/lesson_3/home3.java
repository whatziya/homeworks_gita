package lesson_3;

public class home3 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Android");
        StringBuilder res = new StringBuilder("" + Character.toUpperCase(a.charAt(a.length() - 1)));
        for(int i = a.length() - 2; i >= 1; i--){
            res.append(a.charAt(i));
        }
        res.append(Character.toLowerCase(a.charAt(0)));

        System.out.println(res);
    }
}
