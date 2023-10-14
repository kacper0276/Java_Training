package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TworzenieTabeliNauka {
    public static void main(String[] args) throws Exception{
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/galeria", "root", "");
            statement = conn.createStatement();
            String sql = "CREATE TABLE nauka (" +
                    "id INT NOT NULL PRIMARY KEY," +
                    "title VARCHAR(100) NOT NULL)";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement != null) statement.close();
            if(conn != null) conn.close();
        }
    }
}
