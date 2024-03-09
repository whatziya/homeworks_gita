package lesson_11.abstraction_uchun_masalalar;

public abstract class Car {
    private int maxCapacity;
    private int busyCapacity;

    public Car(int maxCapacity, int busyCapacity){
        this.maxCapacity = maxCapacity;
        this.busyCapacity = busyCapacity;
    }
    abstract int maxLongestWay();
    abstract int getMaxOilFromRefill();

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getBusyCapacity() {
        return busyCapacity;
    }
}
