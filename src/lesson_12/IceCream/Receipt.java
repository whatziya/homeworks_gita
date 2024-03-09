package lesson_12.IceCream;

public class Receipt {
    private int milkCapacity;
    private int sugarMass;

    public Receipt(int milkCapacity, int sugarMass) {
        this.milkCapacity = milkCapacity;
        this.sugarMass = sugarMass;
    }

    public int getMilkCapacity() {
        return milkCapacity;
    }

    public int getSugarMass() {
        return sugarMass;
    }
}
