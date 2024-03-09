package lesson_12.Call;

public class Client {
    private int balance;
    private int callPrice;
    private int smsPrice;

    public Client(int callPrice, int smsPrice){
        this.callPrice = callPrice;
        this.smsPrice = smsPrice;
        this.balance = 0;
    }

    public void addSum(int money){
        balance += money;
    }
     public boolean isActive(){
        return getBalance() >= getCallPrice() || getBalance() >= getSmsPrice();
     }
     public boolean call(int n){
        if(n <= getBalance() / getCallPrice()){
            balance -= n / getCallPrice();
            return true;
        }

        return false;
     }
    public boolean sms(int n){
        if(n <= getBalance() / getSmsPrice()){
            balance -= n / getSmsPrice();
            return true;
        }
        return false;
    }


    public int getBalance() {
        return balance;
    }

    public int getCallPrice() {
        return callPrice;
    }

    public int getSmsPrice() {
        return smsPrice;
    }
}
