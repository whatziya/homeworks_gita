package lesson_13.BookShop;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String bookShopName;
    private int capital;

    List<Book> books = new ArrayList<>();
    public BookShop(String bookShopName, int capital) {
        this.bookShopName = bookShopName;
        this.capital = capital;
    }
    public int buyBooks(Book book, int number){
        int bought = 0;
        for (int i = 0; i < number && capital - book.getPrice() >= 0; i++) {
            books.add(book);
            bought++;
            capital -= book.getPrice();
        }
        return bought;
    }
    public boolean hasBook(){
        return books.size() != 0;
    }
    public boolean hasBook(Book book){
        return books.contains(book);
    }
    public int getMoney(){
        return capital;
    }
    public int sell(Book book, int n){
        int sold = 0;
        for (int i = 0; i < books.size(); i++) {
            if(book.equals(books.get(i))){
                books.remove(i);
                capital += book.getPrice();
                sold++;
            }
        }
        return sold;
    }
    public boolean getCount(){
        if(!hasBook()){
            return false;
        }
        List<Book> uniquedBooks = new ArrayList<>();
        for (Book book : books) {
            if(!uniquedBooks.contains(book)){
                uniquedBooks.add(book);
            }
        }
        for (Book uniquedBook : uniquedBooks) {
            int count = 0;
            for (Book book : books) {
                if(uniquedBook.equals(book)){
                    count++;
                }
            }
            System.out.println(uniquedBook.toString() + " dan " + count + "ta bor");
        }
        return true;
    }
    public boolean getCount(Book book){
        if (!hasBook(book)) {
            return false;
        }
        int count = 0;
        for (Book book1 : books) {
            if(book.equals(book1)){
                count++;
            }
        }
        System.out.println(book.toString() + " dan " + count + "ta bor");
        return true;
    }
    public String getBookShopName(){
        return bookShopName;
    }
}
