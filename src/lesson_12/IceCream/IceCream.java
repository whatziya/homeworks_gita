package lesson_12.IceCream;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    private Receipt receipt;
    private Piece piece;
    private Milk milk;
    private Sugar sugar;

    private int iceCream;
    private int milkRatio;
    private int sugarRatio;
    private int balance;
    private int net;
    private int milkMax;
    private int sugarMax;


    private List<String> journal;

    public IceCream(Receipt receipt, Piece piece) {
        this.receipt = receipt;
        this.piece = piece;
        this.iceCream = 0;
        this.balance = 0;
        this.journal = new ArrayList<>();
        this.net = 0;
    }
    public void addMilk(Milk milk){
        this.milk = milk;
        this.milkMax = milk.getCapacity();
    }
    public void addSugar(Sugar sugar){
        this.sugar = sugar;
        this.sugarMax = sugar.getMass();
    }
    public int getCount(){
        iceCream = 0;
        milkRatio = (piece.getPieceMass() / (receipt.getSugarMass() + receipt.getMilkCapacity())) * receipt.getMilkCapacity();
        sugarRatio = (piece.getPieceMass() / (receipt.getSugarMass() + receipt.getMilkCapacity())) * receipt.getSugarMass();
        iceCream += Math.min(milk.getCapacity() * milkRatio, sugar.getMass() * sugarRatio);
        return iceCream;
    }
    public boolean sell(int n){
        if(iceCream < n){
            return false;
        }
        milk.setCapacity(milk.getCapacity() - n * milkRatio);
        sugar.setMass(sugar.getMass() - n * sugarRatio);
        net += n * piece.getIceCramPrice();
        iceCream -= n;
        balance += n * piece.getIceCramPrice();

        journal.add(n + " x " + piece.getIceCramPrice() + " = " + (n * piece.getIceCramPrice()));
        System.out.println(n + " ta muzqaymoq sotildi" + iceCream + "ta yana sotish mumkin");
        return true;
    }
    public int getBalance(){
        return balance;
    }
    public boolean hasIceCream(){
        return iceCream >= 1;
    }
    public void getInfo(){
        for (String s : journal) {
            System.out.println(s);
        }
    }
    public int getProfit(){
        int net_price = (sugarMax - sugar.getMass()) * sugar.getPrice() + (milkMax - milk.getCapacity()) * milk.getPrice();
        return net - net_price;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public Piece getPiece() {
        return piece;
    }
}