package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DropTableNauka {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/galeria", "root", "");
            statement = conn.createStatement();
            String sql = "DROP TABLE nauka";

            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(statement != null) statement.close();
            if(conn != null) conn.close();
        }
    }
}
