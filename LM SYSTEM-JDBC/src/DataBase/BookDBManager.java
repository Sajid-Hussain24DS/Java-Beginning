package DataBase;

import DataBase.DBConnection;
import Model.Book;
import Model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDBManager {
    Connection conn = DBConnection.getDbConnection();

    public void addBook(Book book) {
        try {
            String sql = "INSERT INTO books (book_id, book_name, isbn, author, quantity) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, book.getBookId());
            stmt.setString(2, book.getBookName());
            stmt.setInt(3, book.getIsbn());
            stmt.setString(4, book.getAuthor());
            stmt.setInt(5, book.getQuantity());
            stmt.executeUpdate();
            System.out.println("Book added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int book_id) {
        try {
            String sql = "DELETE FROM  books WHERE book_id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1,book_id);
            int rowAffected = stmt.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Book deleted Successfully!");
            } else
                System.out.println("No Book found with ID: " + book_id);

        } catch (Exception e) {
            e.printStackTrace();
        }
}

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try {
            String sql = "SELECT * FROM books";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("---- Book List ----");
            while (rs.next()) {
                int id = rs.getInt("book_id");
                String name = rs.getString("book_name");
                int isbn = rs.getInt("isbn");
                String author = rs.getString("author");
                int quantity = rs.getInt("quantity");


                Book book = new Book(id, name, isbn, author, quantity);
                books.add(book);
                System.out.println(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }

}
