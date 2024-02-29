package lesson_5;

public class Kasr {
    int surat;
    int maxraj;
    void showInfo(){
        System.out.println(surat + "/" + maxraj);
    }
    void addTwoKasr(Kasr a, Kasr b){
        surat = a.surat * b.maxraj + b.surat * a.maxraj;
        maxraj = a.maxraj * b.maxraj;
        System.out.println(surat + "/" + maxraj);
    }
    void multiplyTwoKasr(Kasr a, Kasr b){
        surat = a.surat * b.surat;
        maxraj = a.maxraj * b.maxraj;
        System.out.println(surat + "/" + maxraj);
    }
    void divisionTwoKasr(Kasr a, Kasr b){
        surat = a.surat * b.maxraj;
        maxraj = b.surat * a.maxraj;
        System.out.println(surat + "/" + maxraj);
    }
}
