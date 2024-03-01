package lesson_9.Parking;

import java.util.Arrays;

public class Parking {
    private int maxCount;
    private int current = 0;
    Car[] carList;

    public Parking(int maxCount) {
        this.maxCount = maxCount;
        this.carList = new Car[maxCount];
    }
    void showMessage(String message){
        System.out.println(message);
    }
    void addCar(Car car){
        if(maxCount == current){
            showMessage("Joy yetarli emas!");
        } else{
            carList[current++] = car;
            showMessage(car.getNumber() + "raqamli mashina joylandi");
        }
    }

    void addCar(Car[] cars){
        if(maxCount >= current + cars.length){
            for(Car queue : cars){
                carList[current++] = queue;
            }
        } else {
            showMessage("Hammasiga joy yetmayapti!");
        }
    }
    boolean isEmpty(){
        return current == 0;
    }
    boolean isFull(){
        return current == maxCount;
    }
    void show(){
        for(Car queue : carList){
            System.out.println(queue.toString());
        }
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}
