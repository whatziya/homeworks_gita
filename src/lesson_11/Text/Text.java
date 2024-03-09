package lesson_11.Text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private Pen pen;
    private String text;
    private static List<Text> texts = new ArrayList<>();
    public Text(Pen pen, String text){
        this.pen = pen;
        this.text = text;
    }
    public void add(Text text){
        texts.add(text);
        System.out.println("Matn qo'shildi!");
    }
    public void show(){
        for (Text text1 : texts) {
            System.out.println(text1);
        }
    }
    public int count(){
        return texts.size();
    }
    public void clear(String text){
        for (int i = 0; i < texts.size(); i++) {
            if(texts.get(i).getText().equals(text)){
                texts.remove(i);
                System.out.println("Matn o'chirildi!");
            }
        }
    }
    public boolean removeLine(int index) {
        if(index > texts.size() - 1){
            return false;
        }
        texts.remove(index);
        return true;
    }
    public Pen getPen() {
        return pen;
    }

    public String getText() {
        return text;
    }

    public static List<Text> getTexts() {
        return texts;
    }
}
