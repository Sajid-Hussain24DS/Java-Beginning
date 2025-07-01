package DataBase;

import DataBase.DBConnection;
import Model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
}
