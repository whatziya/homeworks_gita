package dars8practice;

import java.util.Arrays;

public class Tekshirish {
    public static void main(String[] args) {
//        Box box = new Box(20);
//        Thing thing1 = new Thing("Kitob", 1);
//        Thing thing2 = new Thing("Yumshoq o'yinchoq", 22);
//        Thing thing3 = new Thing("Yumshoq o'yinchoq", 1);
//        box.push(thing1);
//        box.push(thing2);
//        box.push(thing3);
        Room obsh = new Room(2);
        Student n1 = new Student("Abdujalil", 18);
        Student n2 = new Student("Abdujalil", 18);
        Student n3 = new Student("Abdujalil", 18);
        obsh.add(n1);
        obsh.add(n2);
        obsh.add(n3);
        System.out.println(Arrays.toString(obsh.getStudents()));
    }
}
