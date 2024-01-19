package lesson_14;

import java.util.Arrays;
import java.util.Scanner;

public class dars_vazifa_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Cards[] cards = Cards.values();
        System.out.println(Arrays.toString(cards));
        while(true){
            String ca;
            ca = scanner.nextLine();
            switch (ca.toUpperCase()){
                case "UZCARD": {Cards.UZCARD.showInfo();} break;
                case "HUMO": {Cards.HUMO.showInfo();} break;
            }
                    }
                    }
                    }
