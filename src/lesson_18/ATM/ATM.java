package lesson_18.ATM;


import java.util.ArrayList;

public class ATM {
    private ArrayList<Money> availableMoney;
    private MessageInterface messageListener;
    private ShowMoneyInfoInterface moneyListener;

    public ATM() {
        this.availableMoney = new ArrayList<>();
    }

    public void addMoneys(ArrayList<Money> moneys) {
        availableMoney.addAll(moneys);
    }

    public void setMessageListener(MessageInterface messageListener) {
        this.messageListener = messageListener;
    }

    public void setShowMoneyInfoListener(ShowMoneyInfoInterface moneyListener) {
        this.moneyListener = moneyListener;
    }

    public void isGetMoney(int getSumm) {
        int remainingSum = getSumm;

        for (Money money : availableMoney) {
            int moneyValue = Integer.parseInt(money.getAmount().replace("_", ""));
            int moneyCount = remainingSum / moneyValue;

            if (moneyCount > 0) {
                if (moneyCount <= countMoney(money)) {
                    remainingSum -= moneyCount * moneyValue;
                    moneyListener.showMoneyData(money.getAmount(), moneyCount);
                }
            }
        }

        if (remainingSum > 0) {
            messageListener.showMessage("Xatolik: Mablag' yetarli emas");
        }
    }

    private int countMoney(Money money) {
        int count = 0;
        for (Money m : availableMoney) {
            if (m.getAmount().equals(money.getAmount())) {
                count++;
            }
        }
        return count;
    }

    public int getBalance() {
        int balance = 0;
        for (Money money : availableMoney) {
            balance += Integer.parseInt(money.getAmount().replace("_", "")) * countMoney(money);
        }
        return balance;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        ArrayList<Money> initialMoney = new ArrayList<>();
        initialMoney.add(new Money("1_000"));
        initialMoney.add(new Money("5_000"));
        initialMoney.add(new Money("10_000"));
        atm.addMoneys(initialMoney);

        atm.setMessageListener(message -> System.out.println("Xabar: " + message));
        atm.setShowMoneyInfoListener((amount, count) -> System.out.println(amount + " dan " + count + " ta"));

        int requestedSum = 15_700;
        atm.isGetMoney(requestedSum);

        System.out.println("Joriy balans: " + atm.getBalance());
    }
}
