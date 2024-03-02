package lesson_10.Notepad;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private int size;//beriladigan note uchun max size ni qabul qiladi
    private List<Note> notes;
    public Notepad(int size) {
        this.size = size;
        this.notes = new ArrayList<>();
    }
    void showMessage(String message){
        System.out.println(message);
    }
    public boolean addNote(Pen pen, String content) {
        if (notes.size() >= size) {
            showMessage("Notepad is full.");
            return false;
        }

        for (Note note : notes) {
            if (note.getContent().equals(content)) {
                showMessage("Note already exists.");
                return false;
            }

        }

        notes.add(new Note(pen, content));
        showMessage("Note added.");
        return true;
    }
    void editNote(Pen pen, String note){
        for (Note note1 : notes) {
            if(note.equals(note1.getContent())){
                note1.setPen(pen);
                showMessage("Rangi o'zgartrildi!");
            } else {
                showMessage("Siz nazarda tutgan matn topilmadi.");
            }
        }
    }
    boolean editNote(String oldNote, String newNote){
        for (int i = 0; i < notes.size(); i++) {
            if(oldNote.equals(notes.get(i).getContent())){
                notes.get(i).setContent(newNote);
                showMessage("Matn yangisiga o'zartirildi!");
                return true;
            }
        }
        showMessage("Siz nazarda tutgan matn topilmadi.");
        return false;
    }
    boolean removeNote(String note){
        for (int i = 0; i < notes.size(); i++) {
            if(note.equals(notes.get(i).getContent())){
                notes.remove(i);
                showMessage("Matn o'chirildi");
                return true;
            }
        }
        showMessage("Siz nazarda tutgan matn mavjud topilmadi.");
        return false;
    }
    int getNoteCount(){
        return notes.size();
    }
    int getNoteCount(String color){
        int res = 0;
        for (Note note : notes) {
            if(color.equals(note.getPen().getColor())){
                res++;
            }
        }
        return res;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
