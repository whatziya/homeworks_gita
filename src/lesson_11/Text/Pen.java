package lesson_11.Text;

public class Pen {
    private Color color;
    private TextStyle textStyle;
    public Pen(Color color, TextStyle textStyle){
        this.color = color;
        this.textStyle = textStyle;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color=" + color.getColor() +
                ", textStyle=" + textStyle.getTextStyle() +
                '}';
    }
}
