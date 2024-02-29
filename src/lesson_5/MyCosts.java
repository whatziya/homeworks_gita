package lesson_5;

public class MyCosts {
    String username;
    int money;
    void showInfo(){
        System.out.println("Ismi: " + username);
        System.out.println("Balans: " + money);
        System.out.println("______________________________");
    }
    int getNowMoney(){
        return money;
    }
    void spendMoney(int spend){
        money -= spend;
        System.out.println("Balans: " + money);
        System.out.println("______________________________");
    }
    void addMoney(int addSumm){
        money += addSumm;
        System.out.println("Balans: " + money);
        System.out.println("______________________________");
    }

}
