package lesson_5;

import javax.sound.midi.Soundbank;

public class MakeIceCream {
    int milk;
    int sugar;
    void addMilk(int a){
        milk += a;
    }
    void addSugar(int b){
        sugar += b;
    }
    int maxIceCreamCount(int a, int b){
        int milkc = milk / a;
        int sugarc = sugar / b;
        return Math.min(milkc, sugarc);
    }
    void showInfo(){
        System.out.println("Sut: " + milk);
        System.out.println("Shakar: " + sugar);
    }
    void makeIceCream(int a, int b, int count){
        int milkc = milk / a;
        int sugarc = sugar / b;
        int incount = Math.min(milkc, sugarc);
        if(incount < count){
            System.out.println("Buncha muzqaymoq tayyorlay olmaymiz");
        }
        else{
            milk -= a*count;
            System.out.println("Qolgan sut: " + milk);
            sugar -= b*count;
            System.out.println("Qolgan shakar: " + sugar);
        }
    }
}
