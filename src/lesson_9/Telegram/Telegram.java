package lesson_9.Telegram;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class Telegram {
    private User[] users;
    private int userCount = 0;
    private int userLimit;

    public Telegram(int userLimit) {
        this.users = new User[userLimit];
    }
    boolean createAccount(User user){
        for(User usr : users){
            if(usr.getPhoneNumber().equals(user.getPhoneNumber())){
                return true;
            } else {
                Random random = new Random();
                int OTP = random.nextInt(1000);
                System.out.println("Siz tomondan kelgan raqamga 6 xonali kodni yubordim. Menga shuni yozib yuboring.");
                Scanner sc = new Scanner(System.in);
                int OTP_client = sc.nextInt();
                if(checkSmsCode(OTP, OTP_client)){
                    users[userCount++] = user;
                    return true;
                } else {
                    System.out.println("Xato kiritdingiz! Kechirasiz qayta urining!");
                    return false;
                }
            }
        }
        return true;
    }
    boolean checkSmsCode(int code, int codeClient){
        return code == codeClient;
    }
    int getUserAccount(){
        return userCount;
    }
    boolean deleteAccount(String phoneNumber){
        tekshirish:
        for (int i = 0; i < userCount; i++) {
            if(users[i].getPhoneNumber().equals(phoneNumber)){
                for(int j = i; j < userCount - 1; j++){
                    users[j] = users[j + 1];
                }
                userCount--;
                return true;
            }
        }
        return false;
    }

}
