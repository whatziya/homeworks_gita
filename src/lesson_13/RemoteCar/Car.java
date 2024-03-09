package lesson_13.RemoteCar;

public class Car {
    private int slots;
    private Battery[] batteries;

    public Car(int slots) {
        this.slots = slots;
        this.batteries = new Battery[slots];
    }

    public boolean addBattery(Battery battery) {
        for (int i = 0; i < slots; i++) {
            if (batteries[i] == null) {
                batteries[i] = battery;
                return true;
            }
        }
        return false;
    }

    public boolean run(double hours) {
        for (Battery battery : batteries) {
            if (battery != null) {
                battery.discharge(hours);
                if (battery.getCapacity() == 0) {
                    battery = null;
                }
            }
        }
        return hasRemainingBattery();
    }

    private boolean hasRemainingBattery() {
        for (Battery battery : batteries) {
            if (battery != null) {
                return true;
            }
        }
        return false;
    }

}
