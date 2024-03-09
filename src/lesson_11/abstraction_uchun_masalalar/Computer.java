package lesson_11.abstraction_uchun_masalalar;

public abstract class Computer {
    private String processModel;
    private int diskSize;

    public Computer(String processModel, int diskSize){
        this.processModel = processModel;
        this.diskSize = diskSize;
    }

    abstract void showInfo();

    public String getProcessModel() {
        return processModel;
    }

    public int getDiskSize() {
        return diskSize;
    }
}
