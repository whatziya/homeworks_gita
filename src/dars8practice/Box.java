package dars8practice;

public class Box {
    int capacity;

    public Box(int capacity) {
        this.capacity = capacity;
    }
    int currentCapasity = 0;

    boolean isFull(){
        return capacity <= currentCapasity;
    }
    void push(Thing thing){
        if(!isFull()){
            currentCapasity += thing.getSize();
            System.out.println(thing.getName() + " qo'shildi");
        } else{
            System.out.println("Boxda joy qolmadi!");
        }
    }
}
