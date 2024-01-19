package lesson_18.Wallet;

public class Card {
    private final String userNumber;
    private final String cardNumber;
    private double amount;
    private LogInterface logInterface = null;
    private ShowCardInterface showCardInterface = null;

    public Card(String userNumber, String cardNumber, double amount) {
        this.userNumber = userNumber;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public boolean hasLogListener(){
        return logInterface != null;
    }

    public boolean hasShowCardListener(){
        return logInterface != null;
    }

    public void setLogInterface(LogInterface logInterface){}
    public String getUserNumber() {
        return userNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "userNumber='" + userNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
