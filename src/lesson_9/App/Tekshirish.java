package lesson_9.App;

public class Tekshirish {
    public static void main(String[] args) {
        App app = new App("Telegram", 7);
        App app1 = new App("Telegram1", 7);
        Device d = new Device(120);
        d.install(app);
        d.install(app1);
        d.showApps();


    }
}
