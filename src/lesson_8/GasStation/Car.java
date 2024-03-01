package lesson_8.GasStation;

public class Car {
    private Capacity capacity;
    private Oil oil;

    public Car(Capacity capacity, Oil oil) {
        this.capacity = capacity;
        this.oil = oil;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Oil getOil() {
        return oil;
    }

    public void setOil(Oil oil) {
        this.oil = oil;
    }
}
