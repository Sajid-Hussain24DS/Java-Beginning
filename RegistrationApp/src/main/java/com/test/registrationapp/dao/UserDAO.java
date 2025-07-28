package com.test.registrationapp.dao;

import com.test.registrationapp.db.DBConnection;
import com.test.registrationapp.model.User;
import java.sql.*;

public class UserDAO {

 
   public static boolean insertUser(User user) {
   String sql = "INSERT INTO users (full_name, email, phone_number, gender, address) VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, user.getName());
        stmt.setString(2, user.getEmail());
        stmt.setString(3, user.getPhone());
        stmt.setString(4, user.getGender());
        stmt.setString(5, user.getAddress());

        int rows = stmt.executeUpdate();
        return rows > 0;

    }catch (SQLException e) {
    e.printStackTrace();
    return false;
           }
    

    }
}
