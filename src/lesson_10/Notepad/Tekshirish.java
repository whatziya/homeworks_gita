package lesson_10.Notepad;

public class Tekshirish {
    public static void main(String[] args) {
        //ruchkalar hosil qilamiz
        Pen p1 = new Pen("ko'k");
        Pen p2 = new Pen("qizil");
        Pen p3 = new Pen("yashil");
        //daftar olamiz
        Notepad notepad = new Notepad(10);
        notepad.addNote(p1,"Dilshodbek");
        System.out.println(notepad.getNotes());
    }
}
