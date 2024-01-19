package lesson_14;

public enum Cards {
    UZCARD(){
        @Override
        void showInfo() {
            System.out.println("You chose UZCARD");
        }
    }, HUMO(){
        @Override
        void showInfo() {
            System.out.println("You chose HUMO");
        }
    };

    abstract void showInfo();
}
