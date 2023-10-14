package org.example;

import java.sql.*;

public class SelectNauka {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/galeria", "root", "");
            statement = conn.createStatement(); // Używane do wykonywania zapytań
            String sql = "SELECT id, login, password FROM users";
            ResultSet rs = statement.executeQuery(sql); // Wywołanie i pobranie wyników
            while (rs.next()) {
                int id = rs.getInt("id");
                String login = rs.getString("login");
                System.out.println("Id: " + id + " login: " + login);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(statement != null) statement.close();
                if(conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
