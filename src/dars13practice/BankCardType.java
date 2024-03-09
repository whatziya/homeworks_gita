package dars13practice;

public enum BankCardType {
    UZCARD("UZCARD"), HUMO("HUMO");
    BankCardType(String name){
        System.out.println("Card type: " + name);
    }

}
