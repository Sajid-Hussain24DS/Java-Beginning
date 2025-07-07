package Model;

    public class Book {
        private int bookId;
        private String bookName;
        private String isbn;
        private String author;
        private int quantity;

      //  public Book(int bookId, String bookName, String isbn, String author, int qty) {}

        public Book(int bookId, String bookName, String isbn, String author, int quantity) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.isbn = isbn;
            this.author = author;
            this.quantity = quantity;
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

        public String getIsbn() {
            return isbn;
        }
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }

        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "bookId=" + bookId +
                    ", bookName='" + bookName + '\'' +
                    ", isbn=" + isbn +
                    ", author='" + author + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }


