package lesson_16.Car;

public class Car {
    public static Car instance;
    private String name;
    private final int MAX_CAPACITY = 50;
    private int busyCapacity;

    public Car(){
        this.busyCapacity = 0;
    }

    public static Car getInstance() {
        if(instance == null){
            instance = new Car();
        }
        return instance;
    }

    public boolean isActive(){
        return busyCapacity > 0;
    }
    public boolean refuel(int addPetrol){
        if(busyCapacity + addPetrol <= MAX_CAPACITY){
            busyCapacity += addPetrol;
            return true;
        }
        return false;
    }
    public int getMaxWay(int value){
        return Math.min(value, busyCapacity);
    }
}
