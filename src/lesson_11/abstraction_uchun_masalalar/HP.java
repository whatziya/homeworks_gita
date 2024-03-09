package lesson_11.abstraction_uchun_masalalar;

public class HP extends Computer{
    public HP(String processModel, int diskSize){
        super(processModel, diskSize);
    }

    @Override
    void showInfo() {
        System.out.println("Computer model: " + getProcessModel() + "\n" + "Disk size" + getDiskSize() + "\n");
    }
}
