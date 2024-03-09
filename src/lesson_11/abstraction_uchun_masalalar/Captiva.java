package lesson_11.abstraction_uchun_masalalar;

public class Captiva extends Car{

    public Captiva(int maxCapacity, int busyCapacity) {
        super(maxCapacity, busyCapacity);
    }

    @Override
    int maxLongestWay() {
        return (getMaxCapacity() - getBusyCapacity()) / 2;
    }

    @Override
    int getMaxOilFromRefill() {
        return getMaxCapacity() - getBusyCapacity();
    }
}
