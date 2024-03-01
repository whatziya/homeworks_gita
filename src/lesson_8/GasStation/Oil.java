package lesson_8.GasStation;

public class Oil {
    private int petrol;

    public Oil(int petrol) {
        this.petrol = petrol;
    }

    public int getPetrol() {
        return petrol;
    }

    public void setPetrol(int petrol) {
        this.petrol = petrol;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "petrol=" + petrol +
                '}';
    }
}
