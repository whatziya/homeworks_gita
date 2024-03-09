package lesson_12.IceCream;

public class Milk {
    private int capacity;
    private int price;

    public Milk(int capacity, int price) {
        this.capacity = capacity;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
