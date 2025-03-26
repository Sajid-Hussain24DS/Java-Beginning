package Library_Management_System;

public class Book {
    int bookId;
    String bookName;
    int bookIsbian;
    String bookAuthor;
    int bookQuantity;
    public Book(String bookName,  int bookIsbian, String bookAuthor,int bookQuantity,int  bookId){
        this.bookName = bookName;
        this.bookIsbian = bookIsbian;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookIsbian() {
        return bookIsbian;
    }

    public void setBookIsbian(int bookIsbian) {
        this.bookIsbian = bookIsbian;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public void showBookData(){
        System.out.println(bookName + "     " + bookId + "     " + bookIsbian + "     " + bookAuthor+"    "+bookQuantity);
    }


}
