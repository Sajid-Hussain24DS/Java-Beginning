package LMS;

public class Book {

    String bookName;
    int bookIsbn;
    String bookAuthor;
    int bookQuantity;
    int bookId;
    public Book(String bookName, int bookIsbian, String bookAuthor, int bookQuantity, int bookId){
        this.bookName = bookName;
        this.bookIsbn = bookIsbian;
        this.bookAuthor = bookAuthor;
        this.bookQuantity = bookQuantity;
        this.bookId = bookId;
    }


    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }


}




