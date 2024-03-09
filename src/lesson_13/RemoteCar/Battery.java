package lesson_13.RemoteCar;

public class Battery {
    private double capacity;//mAh
    private final double BATTERY_CAPACITY = 1.5;

    public Battery(int capacity) {
        this.capacity = capacity;
    }
    public double getCapacity() {
        return this.capacity;
    }

    public void discharge(double hours) {
        double power = BATTERY_CAPACITY * this.capacity; // kuchlanish
        double current = power / BATTERY_CAPACITY; // I
        double voltage = BATTERY_CAPACITY; // U
        double consumedPower = current * voltage * hours; // P = IU
        double remainingCapacity = Math.max(0, this.capacity - (consumedPower / BATTERY_CAPACITY));
        this.capacity = remainingCapacity;
    }
}
