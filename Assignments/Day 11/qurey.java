package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class qurey {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/test1";
        String user = "username";
        String password = "password";
        
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT * FROM  mytable WHERE column_name = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "value_to_search");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


        