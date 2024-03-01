package lesson_8.HardDive;

public class HardDrive {
    private int totalSpace;
    private int usedSpace;

    public HardDrive(int totalSpace) {
        this.totalSpace = totalSpace;
        this.usedSpace = 0;
    }

    public void write(File file) {
        if (file.getSize() <= getFreeSpace()) {
            usedSpace += file.getSize();
            System.out.println("File " + file.getName() + " is written to the hard drive.");
        } else {
            System.out.println("Not enough space on the hard drive to write file " + file.getName());
        }
    }

    public void remove(int fileSize) {
        if (fileSize <= usedSpace) {
            usedSpace -= fileSize;
            System.out.println("Space of size " + fileSize + " is removed from the hard drive.");
        } else {
            System.out.println("Cannot remove space. Not enough space used on the hard drive.");
        }
    }

    public void clear() {
        usedSpace = 0;
        System.out.println("Hard drive space is cleared.");
    }

    public boolean isEmpty() {
        return usedSpace == 0;
    }

    public boolean isFull() {
        return usedSpace == totalSpace;
    }

    public int getUsedSpace() {
        return usedSpace;
    }

    public int getFreeSpace() {
        return totalSpace - usedSpace;
    }
}
