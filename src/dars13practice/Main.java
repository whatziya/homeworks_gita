package dars13practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankCardType uzcard = BankCardType.UZCARD;
        BankCardType humo = BankCardType.HUMO;
        boolean bankOlindi = false;
        while(!bankOlindi) {
            System.out.println("Sizga qaysi turdagi karta kerak bo'ladi: ");
            String card = sc.nextLine();
            System.out.println("Murojatingiz bajarilmoqda....");
            if (card.equalsIgnoreCase(uzcard.name())){
                System.out.println("Karta chiqarildi!!!");
                bankOlindi = true;
            } else {
                System.out.println("Iltimos karta turini to'g'ri yozing!");
                System.out.println("Agarda karta olmoqchi bo'lmasangiz 0 ni bosing, aks holda 1 ni bosing");
                int num = sc.nextInt();
                sc.nextLine();

                bankOlindi = num == 0 ? true : false;
            }
        }
    }
}
