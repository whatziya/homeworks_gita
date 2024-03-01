package lesson_8.GasStation;

public class GasStation {
    private int howMuchOil;
    int imaginaryOilCApacity = howMuchOil;

    public GasStation(int howMuchOil) {
        this.howMuchOil = howMuchOil;
    }
    boolean isEmpty(){
        return howMuchOil == 0;
    }
    void toSell(Car car){
        if(howMuchOil >= car.getCapacity().getCapacity() - car.getOil().getPetrol()){
            car.setOil(new Oil(car.getCapacity().getCapacity()));
            System.out.println(car.getOil().toString());
            howMuchOil -= car.getCapacity().getCapacity();
            imaginaryOilCApacity -= car.getCapacity().getCapacity();

        } else{
            System.out.println("Not enough petrol to fill");
        }
    }
    boolean checkSell(Car car){
        if(howMuchOil >= car.getCapacity().getCapacity() - car.getOil().getPetrol()){
            car.setOil(new Oil(car.getCapacity().getCapacity()));
            howMuchOil -= car.getCapacity().getCapacity();
            return true;
        } else{
            System.out.println("Not enough petrol to fill");
            return false;
        }
    }
    boolean isSell(Car[] cars){
        for(Car car: cars){
            if(!checkSell(car)){
                return false;
            }
        }
        howMuchOil = imaginaryOilCApacity;
        return true;
    }
}
