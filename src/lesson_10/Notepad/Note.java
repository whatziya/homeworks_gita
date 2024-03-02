package lesson_10.Notepad;

public class Note {
    private Pen pen;
    private String content;
    public Note(Pen pen, String content) {
        this.pen = pen;
        this.content = content;
    }


    public Pen getPen() {
        return pen;
    }

    public String getContent() {
        return content;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Note{" +
                "pen=" + pen +
                ", content='" + content + '\'' +
                '}';
    }
}
